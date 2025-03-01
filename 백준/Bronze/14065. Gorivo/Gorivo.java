import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double mpg = Double.parseDouble(br.readLine());

        final double GALLON_TO_LITER = 3.785411784;
        final double MILE_TO_KM = 1.609344;

        double lPer100km = (100 * GALLON_TO_LITER) / (mpg * MILE_TO_KM);

        System.out.println(new DecimalFormat("0.######").format(lPer100km));
    }
}