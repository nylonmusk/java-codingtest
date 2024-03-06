import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder answer = new StringBuilder();

        while (T-- > 0) {
            int yonsei = 0;
            int korea = 0;
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                yonsei += Integer.parseInt(st.nextToken());
                korea += Integer.parseInt(st.nextToken());
            }

            if (yonsei > korea) {
                answer.append("Yonsei");
            } else if (yonsei < korea) {
                answer.append("Korea");
            } else {
                answer.append("Draw");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
