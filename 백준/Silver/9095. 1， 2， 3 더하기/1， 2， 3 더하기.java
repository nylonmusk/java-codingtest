import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[11];
        arr[0] = 1;
        for (int i = 1; i <= 10; i++) {
            if (i >= 1) {
                arr[i] += arr[i - 1];
            }
            if (i >= 2) {
                arr[i] += arr[i - 2];
            }
            if (i >= 3) {
                arr[i] += arr[i - 3];
            }
        }
        while (T-- > 0) {
            sb.append(arr[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.println(sb);
    }
}