import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            String score = br.readLine().replaceAll("[069]", "9");
            int adjustedScore = Integer.parseInt(score);
            sum += Math.min(adjustedScore, 100);
        }

        double average = (double) sum / N;
        int roundedAverage = (int) Math.round(average);

        System.out.println(roundedAverage);
    }
}