import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        DecimalFormat df = new DecimalFormat("0.00");

        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            int H = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            System.out.println(df.format((double) H / P));
        }
    }
}