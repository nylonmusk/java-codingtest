import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            double value1 = Double.parseDouble(tokenizer.nextToken());
            double value2 = Double.parseDouble(tokenizer.nextToken());

            double distance = Math.abs(value1 - value2);

            System.out.printf("%.1f%n", distance);
        }

    }
}
