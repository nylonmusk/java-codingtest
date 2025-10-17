import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) break;

            StringTokenizer st = new StringTokenizer(line);
            int M = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (M == 0 && A == 0 && B == 0) break;

            double diff = (double) M / A - (double) M / B;

            int totalSeconds = (int) Math.round(diff * 3600);

            int hours = totalSeconds / 3600;
            totalSeconds %= 3600;
            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;

            System.out.printf("%d:%02d:%02d%n", hours, minutes, seconds);
        }
    }
}