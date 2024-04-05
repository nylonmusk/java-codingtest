import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int Q1 = 0;
        int Q2 = 0;
        int Q3 = 0;
        int Q4 = 0;
        int AXIS = 0;

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x == 0 || y == 0) {
                AXIS++;
                continue;
            }

            if (x > 0 && y > 0) {
                Q1++;
                continue;
            }

            if (x < 0 && y > 0) {
                Q2++;
                continue;
            }

            if (x < 0 && y < 0) {
                Q3++;
                continue;
            }

            if (x > 0 && y < 0) {
                Q4++;
            }
        }

        StringBuilder answer = new StringBuilder();
        answer.append("Q1: ").append(Q1).append("\n");
        answer.append("Q2: ").append(Q2).append("\n");
        answer.append("Q3: ").append(Q3).append("\n");
        answer.append("Q4: ").append(Q4).append("\n");
        answer.append("AXIS: ").append(AXIS);

        System.out.println(answer);
    }
}
