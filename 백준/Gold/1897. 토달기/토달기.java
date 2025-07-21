import java.io.*;
import java.util.*;

public class Main {

    static Set<String> dict = new HashSet<>();
    static Map<String, String> nextWord = new HashMap<>();
    static Map<String, Integer> memo = new HashMap<>();

    static int dfs(String word) {
        if (memo.containsKey(word)) return memo.get(word);

        int maxLen = word.length();
        String bestNext = null;

        for (int i = 0; i <= word.length(); i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                StringBuilder sb = new StringBuilder(word);
                sb.insert(i, ch);
                String newWord = sb.toString();

                if (dict.contains(newWord)) {
                    int len = dfs(newWord);
                    if (len > maxLen) {
                        maxLen = len;
                        bestNext = newWord;
                    }
                }
            }
        }

        memo.put(word, maxLen);
        if (bestNext != null) {
            nextWord.put(word, bestNext);
        }
        return maxLen;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int d = Integer.parseInt(st.nextToken());
        String start = st.nextToken();

        for (int i = 0; i < d; i++) {
            String word = br.readLine();
            dict.add(word);
        }

        dfs(start);

        StringBuilder answer = new StringBuilder();
        String current = start;
        answer.append(current);
        while (nextWord.containsKey(current)) {
            current = nextWord.get(current);
            answer.setLength(0);
            answer.append(current);
        }

        System.out.println(answer);
    }
}