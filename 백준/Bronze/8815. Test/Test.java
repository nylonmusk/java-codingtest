import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Z = Integer.parseInt(br.readLine());

        String pattern = "ABCBCDCDADAB";
        int patternLength = pattern.length();

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < Z; i++) {
            int N = Integer.parseInt(br.readLine());

            char c = pattern.charAt((N - 1) % patternLength);
            answer.append(c).append("\n");
        }

        System.out.print(answer);
    }
}