import java.io.*;
import java.util.*;

public class Main {
    private static String convertPattern(String word) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder pattern = new StringBuilder();
        int idx = 0;

        for (char c : word.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, idx++);
            }
            pattern.append(map.get(c));
        }

        return pattern.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        String[] patterns = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
            patterns[i] = convertPattern(words[i]);
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (patterns[i].equals(patterns[j])) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}