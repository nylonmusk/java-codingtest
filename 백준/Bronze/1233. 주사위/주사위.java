import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int S1 = Integer.parseInt(input[0]);
        int S2 = Integer.parseInt(input[1]);
        int S3 = Integer.parseInt(input[2]);

        int[] count = new int[S1 + S2 + S3 + 1];

        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    count[i + j + k]++;
                }
            }
        }

        int maxCount = 0;
        int result = 0;
        for (int i = 3; i <= S1 + S2 + S3; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                result = i;
            }
        }

        System.out.println(result);
    }
}