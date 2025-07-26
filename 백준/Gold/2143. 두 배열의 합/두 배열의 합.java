import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long T = Long.parseLong(br.readLine());

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) A[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        int[] B = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) B[i] = Integer.parseInt(st.nextToken());

        List<Long> subA = getSubSums(A);
        Map<Long, Integer> mapB = getSubSumCount(B);

        long count = 0;
        for (long a : subA) {
            long target = T - a;
            count += mapB.getOrDefault(target, 0);
        }

        System.out.println(count);
    }

    static List<Long> getSubSums(int[] arr) {
        List<Long> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                result.add(sum);
            }
        }
        return result;
    }

    static Map<Long, Integer> getSubSumCount(int[] arr) {
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        return map;
    }
}