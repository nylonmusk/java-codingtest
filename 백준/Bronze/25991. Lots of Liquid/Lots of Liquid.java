import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        double totalVolume = 0.0;

        for (int i = 0; i < n; i++) {
            double side = Double.parseDouble(st.nextToken());
            totalVolume += Math.pow(side, 3);
        }

        double answer = Math.cbrt(totalVolume);

        System.out.printf("%.6f\n", answer);
    }
}