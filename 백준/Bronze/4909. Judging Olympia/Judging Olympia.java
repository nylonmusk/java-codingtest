import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int[] scores = new int[6];
            boolean isAllZero = true;

            for (int i = 0; i < 6; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
                if (scores[i] != 0) {
                    isAllZero = false;
                }
            }

            if (isAllZero) break;

            Arrays.sort(scores);

            int sum = 0;
            for (int i = 1; i <= 4; i++) {
                sum += scores[i];
            }

            double avg = sum / 4.0;

            if (avg == (int) avg) {
                System.out.println((int) avg);
            } else {
                System.out.println(avg);
            }
        }
    }
}