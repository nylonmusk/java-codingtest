import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int answer = 5;
        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] <= arr[i] + 4) {
                    cnt++;
                } else {
                    break;
                }
            }
            answer = Math.min(answer, 5 - cnt);
        }

        System.out.println(answer);
    }
}