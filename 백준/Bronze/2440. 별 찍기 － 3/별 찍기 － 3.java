import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int T = N;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < T; j++) {
                sb.append("*");
            }
            sb.append("\n");
            T--;
        }
        System.out.println(sb);
    }
}