import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int c = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            answer.append("You get ").append(c / v).append(" piece(s) and your dad gets ").append(c % v).append(" piece(s).").append("\n");
        }
        System.out.println(answer);
    }
}
