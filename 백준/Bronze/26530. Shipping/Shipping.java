import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            double total = 0.0;

            for (int j = 0; j < x; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                int quantity = Integer.parseInt(st.nextToken());
                double price = Double.parseDouble(st.nextToken());

                total += quantity * price;
            }

            System.out.printf("$%.2f\n", total);
        }
    }
}