import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            M -= 45;
            if (M < 0) {
                M += 60;
                H = (H == 0) ? 23 : H - 1;
            }

            answer.append("Case #").append(i).append(": ").append(H).append(" ").append(M).append("\n");
        }
        System.out.print(answer);
    }
}