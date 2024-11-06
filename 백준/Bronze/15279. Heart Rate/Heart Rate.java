import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.0000");

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            double p = Double.parseDouble(st.nextToken());

            double minABPM = 60.0 * (b - 1) / p;
            double bpm = 60.0 * b / p;
            double maxABPM = 60.0 * (b + 1) / p;

            System.out.println(df.format(minABPM) + " " + df.format(bpm) + " " + df.format(maxABPM));
        }
    }
}