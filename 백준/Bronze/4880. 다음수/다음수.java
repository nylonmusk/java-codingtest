import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());

            if (a1 == 0 && a2 == 0 && a3 == 0) {
                break;
            }

            if (a2 - a1 == a3 - a2) {
                int next = a3 + (a3 - a2);
                answer.append("AP ").append(next).append("\n");
            } else if (a2 / a1 == a3 / a2) {
                int next = a3 * (a3 / a2);
                answer.append("GP ").append(next).append("\n");
            }
        }

        System.out.print(answer);
    }
}