import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        double commission = 25 + k * 0.01;
        commission = Math.max(100, Math.min(2000, commission));

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(commission));
    }
}