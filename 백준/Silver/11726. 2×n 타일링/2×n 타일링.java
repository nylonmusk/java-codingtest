import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 2];

        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            int temp = arr[i - 1] + arr[i - 2];
            if (temp > 10007) {
                temp %= 10007;
            }
            arr[i] = temp;
        }

        System.out.println(arr[n]);
    }
}