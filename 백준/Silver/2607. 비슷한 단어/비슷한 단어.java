import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String first = br.readLine();

        int[] firstCount = new int[26];
        for (char c : first.toCharArray()) {
            firstCount[c - 'A']++;
        }

        int answer = 0;
        for (int i = 1; i < N; i++) {
            String word = br.readLine();
            int[] wordCount = new int[26];
            for (char c : word.toCharArray()) {
                wordCount[c - 'A']++;
            }

            int diff = 0;
            for (int j = 0; j < 26; j++) {
                diff += Math.abs(firstCount[j] - wordCount[j]);
            }

            if (diff == 0 || diff == 1 || (diff == 2 && first.length() == word.length())) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}