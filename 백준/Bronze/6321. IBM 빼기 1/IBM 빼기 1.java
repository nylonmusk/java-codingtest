import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String computerName = br.readLine();
            StringBuilder result = new StringBuilder();

            for (char c : computerName.toCharArray()) {
                result.append(c == 'Z' ? 'A' : (char) (c + 1));
            }

            System.out.println("String #" + i);
            System.out.println(result);
            if (i < n) {
                System.out.println();
            }
        }
    }
}