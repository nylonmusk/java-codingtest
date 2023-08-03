import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        String s = "";
        StringTokenizer st;
        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int[] values = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                values[i] = Math.abs(arr[i] - arr[i + 1]);
            }

            boolean isJolly = true;
            Arrays.sort(values);
            for (int i = 1; i < n; i++) {
                if (values[i - 1] != i) {
                    isJolly = false;
                    break;
                }
            }
            answer.append(isJolly ? "Jolly" : "Not jolly").append("\n");
        }
        System.out.println(answer);
    }
}
