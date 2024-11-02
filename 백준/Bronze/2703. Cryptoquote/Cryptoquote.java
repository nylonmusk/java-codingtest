import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String encryptedMessage = br.readLine();
            String rules = br.readLine();

            StringBuilder decodedMessage = new StringBuilder();
            for (char ch : encryptedMessage.toCharArray()) {
                if (ch == ' ') {
                    decodedMessage.append(' ');
                } else {
                    decodedMessage.append(rules.charAt(ch - 'A'));
                }
            }
            result.append(decodedMessage).append("\n");
        }

        System.out.print(result);
    }
}