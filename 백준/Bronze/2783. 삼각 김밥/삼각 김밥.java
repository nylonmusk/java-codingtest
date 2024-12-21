import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());

        double minCostPerGram = x / y;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            double xi = Double.parseDouble(st.nextToken());
            double yi = Double.parseDouble(st.nextToken());
            minCostPerGram = Math.min(minCostPerGram, xi / yi);
        }

        double answer = minCostPerGram * 1000;
        System.out.printf("%.2f\n", answer);
    }
}