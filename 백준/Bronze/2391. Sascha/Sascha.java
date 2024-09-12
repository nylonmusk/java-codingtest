import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String pronounced = br.readLine();
            int w = Integer.parseInt(br.readLine());
            String[] dictionary = new String[w];

            for (int j = 0; j < w; j++) {
                dictionary[j] = br.readLine();
            }

            String mostLikelyWord = dictionary[0];
            int minDifference = calculateDifference(pronounced, dictionary[0]);

            for (int j = 1; j < w; j++) {
                int currentDifference = calculateDifference(pronounced, dictionary[j]);
                if (currentDifference < minDifference) {
                    minDifference = currentDifference;
                    mostLikelyWord = dictionary[j];
                }
            }

            System.out.println(mostLikelyWord);
        }
    }

    private static int calculateDifference(String word1, String word2) {
        int difference = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                difference++;
            }
        }
        return difference;
    }
}