import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final double BLASTER_PRICE = 350.34;
        final double VISUAL_SENSOR_PRICE = 230.90;
        final double AUDITORY_SENSOR_PRICE = 190.55;
        final double ARM_PRICE = 125.30;
        final double LEG_PRICE = 180.90;

        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int blasterCount = Integer.parseInt(st.nextToken());
            int visualSensorCount = Integer.parseInt(st.nextToken());
            int auditorySensorCount = Integer.parseInt(st.nextToken());
            int armCount = Integer.parseInt(st.nextToken());
            int legCount = Integer.parseInt(st.nextToken());

            double totalCost = (blasterCount * BLASTER_PRICE) +
                    (visualSensorCount * VISUAL_SENSOR_PRICE) +
                    (auditorySensorCount * AUDITORY_SENSOR_PRICE) +
                    (armCount * ARM_PRICE) +
                    (legCount * LEG_PRICE);

            answer.append(String.format("$%.2f", totalCost)).append("\n");
        }

        System.out.print(answer);
    }
}