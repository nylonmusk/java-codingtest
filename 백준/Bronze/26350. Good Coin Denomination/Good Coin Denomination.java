import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            int d = Integer.parseInt(st.nextToken());
            int[] coins = new int[d];
            for (int j = 0; j < d; j++) {
                coins[j] = Integer.parseInt(st.nextToken());
            }
            
            System.out.print("Denominations:");
            for (int j = 0; j < d; j++) {
                System.out.print(" " + coins[j]);
            }
            System.out.println();

            boolean good = true;
            for (int j = 1; j < d; j++) {
                if (coins[j] < coins[j - 1] * 2) {
                    good = false;
                    break;
                }
            }

            if (good) {
                System.out.println("Good coin denominations!");
            } else {
                System.out.println("Bad coin denominations!");
            }

            System.out.println();
        }
    }
}