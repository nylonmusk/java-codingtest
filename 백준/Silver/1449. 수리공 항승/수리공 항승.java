import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int count = 1;
        double cover = arr[0] - 0.5 + L;

        for (int i = 1; i < N; i++) {
            if (arr[i] + 0.5 > cover) {
                count++;
                cover = arr[i] - 0.5 + L;
            }
        }

        System.out.println(count);
    }
}