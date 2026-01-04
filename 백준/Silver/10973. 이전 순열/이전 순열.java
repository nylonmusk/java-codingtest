import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int i = N - 1;
        while (i > 0 && arr[i - 1] < arr[i]) i--;

        if (i == 0) {
            System.out.println(-1);
            return;
        }

        int j = N - 1;
        while (arr[i - 1] < arr[j]) j--;

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        int left = i, right = N - 1;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        StringBuilder answer = new StringBuilder();
        for (int k = 0; k < N; k++) {
            answer.append(arr[k]);
            if (k + 1 < N) answer.append(' ');
        }
        System.out.print(answer);
    }
}