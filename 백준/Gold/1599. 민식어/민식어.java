import java.io.*;
import java.util.*;

public class Main {

    static final String[] MINSIK_ORDER = {
            "a", "b", "k", "d", "e", "g", "h", "i", "l",
            "m", "n", "ng", "o", "p", "r", "s", "t", "u", "w", "y"
    };

    static Map<String, Integer> orderMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < MINSIK_ORDER.length; i++) {
            orderMap.put(MINSIK_ORDER[i], i);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> words = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            words.add(br.readLine());
        }

        words.sort((w1, w2) -> {
            List<Integer> encoded1 = encode(w1);
            List<Integer> encoded2 = encode(w2);
            int len = Math.min(encoded1.size(), encoded2.size());
            for (int i = 0; i < len; i++) {
                if (!encoded1.get(i).equals(encoded2.get(i))) {
                    return encoded1.get(i) - encoded2.get(i);
                }
            }
            return encoded1.size() - encoded2.size();
        });

        for (String word : words) {
            System.out.println(word);
        }
    }

    private static List<Integer> encode(String word) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < word.length(); ) {
            if (i < word.length() - 1 && word.charAt(i) == 'n' && word.charAt(i + 1) == 'g') {
                result.add(orderMap.get("ng"));
                i += 2;
            } else {
                result.add(orderMap.get(String.valueOf(word.charAt(i))));
                i++;
            }
        }
        return result;
    }
}