import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder answer = new StringBuilder();
        char prevChar = input.charAt(0);
        answer.append(prevChar);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != prevChar) {
                answer.append(currentChar);
            }
            prevChar = currentChar;
        }

        System.out.println(answer);
    }
}