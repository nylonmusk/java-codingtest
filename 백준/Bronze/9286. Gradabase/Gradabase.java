import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int m = Integer.parseInt(br.readLine());
            answer.append("Case ").append(i).append(":\n");

            for (int j = 0; j < m; j++) {
                int grade = Integer.parseInt(br.readLine()) + 1;
                if (grade >= 1 && grade <= 6) {
                    answer.append(grade).append("\n");
                }
            }
        }

        System.out.print(answer);
    }
}