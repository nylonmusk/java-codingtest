import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> words = new HashMap<>();
        while (N-- > 0) {
            String word = br.readLine();
            if (word.length() >= M) {
                words.put(word, words.getOrDefault(word, 0) + 1);
            }
        }

        List<String> keySet = new ArrayList<>(words.keySet());

        Collections.sort(keySet, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                int frequency = Integer.compare(words.get(word2), words.get(word1));
                if (frequency != 0) {
                    return frequency;
                }

                int length = Integer.compare(word2.length(), word1.length());
                if (length != 0) {
                    return length;
                }

                return word1.compareTo(word2);
            }
        });

        for (String s : keySet) {
            answer.append(s).append("\n");
        }
        System.out.println(answer);
    }
}
