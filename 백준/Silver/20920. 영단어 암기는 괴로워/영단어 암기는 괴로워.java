import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> words = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                words.put(word, words.getOrDefault(word, 0) + 1);
            }
        }

        List<String> keySet = new ArrayList<>(words.keySet());

        keySet.sort((word1, word2) -> {
            int frequency = Integer.compare(words.get(word2), words.get(word1));
            if (frequency != 0) {
                return frequency;
            }

            int length = Integer.compare(word2.length(), word1.length());
            if (length != 0) {
                return length;
            }

            return word1.compareTo(word2);
        });

        StringBuilder answer = new StringBuilder();
        for (String s : keySet) {
            answer.append(s).append("\n");
        }
        
        System.out.println(answer);
    }
}