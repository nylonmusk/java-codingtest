import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            int errors = 0;

            for (int j = 0; j < line.length(); j += 8) {
                String block = line.substring(j, j + 8);
                int ones = 0;

                for (int k = 0; k < 7; k++) {
                    if (block.charAt(k) == '1') {
                        ones++;
                    }
                }

                char parityBit = block.charAt(7);
                if ((ones % 2 == 0 && parityBit != '0') || (ones % 2 == 1 && parityBit != '1')) {
                    errors++;
                }
            }

            System.out.println(errors);
        }
    }
}