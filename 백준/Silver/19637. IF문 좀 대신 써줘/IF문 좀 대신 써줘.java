import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> names = new ArrayList<>();
        List<Integer> limits = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            names.add(st.nextToken());
            limits.add(Integer.parseInt(st.nextToken()));
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int power = Integer.parseInt(br.readLine());
            int idx = binarySearch(limits, power);
            answer.append(names.get(idx)).append("\n");
        }

        System.out.print(answer);
    }

    static int binarySearch(List<Integer> limits, int power) {
        int left = 0;
        int right = limits.size() - 1;
        int answer = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (power <= limits.get(mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
}