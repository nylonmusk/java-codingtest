import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        DecimalFormat df = new DecimalFormat("$#.00");

        for (int i = 0; i < t; i++) {
            double originalPrice = Double.parseDouble(br.readLine());
            double discountedPrice = originalPrice * 0.8;
            System.out.println(df.format(discountedPrice));
        }
    }
}