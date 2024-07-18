import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String input;

        final double MOON_GRAVITY = 0.167;
        DecimalFormat df = new DecimalFormat("0.00");

        while ((input = br.readLine()) != null) {
            double earthWeight = Double.parseDouble(input.trim());
            if (earthWeight < 0) {
                break;
            }

            double moonWeight = earthWeight * MOON_GRAVITY;

            System.out.println("Objects weighing " + df.format(earthWeight) +
                    " on Earth will weigh " + df.format(moonWeight) + " on the moon.");
        }
    }
}