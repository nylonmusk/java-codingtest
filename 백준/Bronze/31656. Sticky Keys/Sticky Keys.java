import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder answer = new StringBuilder();
        char prev = 0;

        for (char current : input.toCharArray()) {
            if (current != prev) {
                answer.append(current);
                prev = current;
            }
        }

        System.out.println(answer);
    }
}