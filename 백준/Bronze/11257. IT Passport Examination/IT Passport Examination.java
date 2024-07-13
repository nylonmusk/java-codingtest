import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            String examNumber = input[0];
            int strategyScore = Integer.parseInt(input[1]);
            int managementScore = Integer.parseInt(input[2]);
            int technologyScore = Integer.parseInt(input[3]);

            int totalScore = strategyScore + managementScore + technologyScore;
            boolean isPass = (totalScore >= 55) &&
                    (strategyScore >= 35 * 0.3) &&
                    (managementScore >= 25 * 0.3) &&
                    (technologyScore >= 40 * 0.3);

            System.out.printf("%s %d %s\n", examNumber, totalScore, isPass ? "PASS" : "FAIL");
        }
    }
}