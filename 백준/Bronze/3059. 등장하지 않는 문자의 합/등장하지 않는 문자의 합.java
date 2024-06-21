import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while (T-- > 0) {
            String s = br.readLine();
            boolean[] alphabet = new boolean[26];

            for (char c : s.toCharArray()) {
                alphabet[c - 'A'] = true;
            }

            int sum = 0;
            for (int i = 0; i < 26; i++) {
                if (!alphabet[i]) {
                    sum += (i + 65);
                }
            }

            answer.append(sum).append("\n");
        }

        System.out.print(answer);
    }
}
