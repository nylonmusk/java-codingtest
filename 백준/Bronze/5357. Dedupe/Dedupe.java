import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String input = br.readLine();
            StringBuilder result = new StringBuilder();

            char prevChar = '\0';

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                if (currentChar != prevChar) {
                    result.append(currentChar);
                    prevChar = currentChar;
                }
            }

            System.out.println(result.toString());
        }
    }
}
