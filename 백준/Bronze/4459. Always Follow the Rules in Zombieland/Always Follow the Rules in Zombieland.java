import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());
        String[] quotes = new String[q];

        for (int i = 0; i < q; i++) {
            quotes[i] = br.readLine();
        }

        int r = Integer.parseInt(br.readLine());

        for (int i = 0; i < r; i++) {
            int ruleNumber = Integer.parseInt(br.readLine());

            if (ruleNumber > 0 && ruleNumber <= q) {
                System.out.println("Rule " + ruleNumber + ": " + quotes[ruleNumber - 1]);
            } else {
                System.out.println("Rule " + ruleNumber + ": No such rule");
            }
        }
    }
}