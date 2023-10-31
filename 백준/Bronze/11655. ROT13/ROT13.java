import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder answer = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                answer.append((char) ((c - 'A' + 13) % 26 + 'A'));
            } else if (c >= 'a' && c <= 'z') {
                answer.append((char) ((c - 'a' + 13) % 26 + 'a'));
            } else {
                answer.append(c);
            }
        }
        System.out.println(answer);
    }
}
