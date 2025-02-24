import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");

        String s;
        while ((s = br.readLine()) != null) {
            double w = Double.parseDouble(s);
            if (w == 0) break;

            double total = 1 + w + Math.pow(w, 2) + Math.pow(w, 3) + Math.pow(w, 4);
            System.out.println(df.format(total));
        }
    }
}