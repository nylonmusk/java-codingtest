import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().replaceAll("9", "6"));
        int[][] arr = new int[9][1];

        while (N != 0) {
            arr[N % 10][0] = arr[N % 10][0] + 1;
            N /= 10;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            if (i != 6) {
                max = Math.max(arr[i][0], max);
            } else {
                if (arr[i][0] % 2 != 0) {
                    max = Math.max(arr[i][0] / 2 + 1, max);
                } else {
                    max = Math.max(arr[i][0] / 2, max);
                }
            }
        }
        System.out.println(max);
    }
}