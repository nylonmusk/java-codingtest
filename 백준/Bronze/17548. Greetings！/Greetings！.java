import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int eCount = 0;
        for (char c : input.toCharArray()) {
            if (c == 'e') {
                eCount++;
            }
        }

        StringBuilder answer = new StringBuilder();
        answer.append('h');
        for (int i = 0; i < eCount * 2; i++) {
            answer.append('e');
        }
        answer.append('y');

        System.out.println(answer);
    }
}
