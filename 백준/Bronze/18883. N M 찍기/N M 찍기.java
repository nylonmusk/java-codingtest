import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder answer = new StringBuilder();
        int num = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                answer.append(num);
                num++;
                if (j != M) {
                    answer.append(" ");
                }
            }
            if (i != N) {
                answer.append("\n");
            }
        }

        System.out.println(answer);

    }
}