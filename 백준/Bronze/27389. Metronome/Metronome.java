import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        double revolutions = n / 4.0;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(revolutions));
    }
}