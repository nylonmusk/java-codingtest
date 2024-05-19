import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String answer = null;

        int n = s.length();

        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String part1 = new StringBuilder(s.substring(0, i)).reverse().toString();
                String part2 = new StringBuilder(s.substring(i, j)).reverse().toString();
                String part3 = new StringBuilder(s.substring(j)).reverse().toString();

                String candidate = part1 + part2 + part3;
                if (answer == null || candidate.compareTo(answer) < 0) {
                    answer = candidate;
                }
            }
        }

        System.out.println(answer);
    }
}
