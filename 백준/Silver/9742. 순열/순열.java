import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int count;
    static int n;
    static String value;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        String s = "";
        while ((s = br.readLine()) != null) {
            count = 0;
            value = "";
            StringTokenizer st = new StringTokenizer(s);
            String word = st.nextToken();
            char[] words = word.toCharArray();
            n = Integer.parseInt(st.nextToken());
            permutation(words, new ArrayList<>());
            answer.append(word).append(" ").append(n).append(" = ");
            if (!value.equals("")) {
                answer.append(value.replaceAll(",", "").replaceAll(" ", "").replaceAll("\\[", "").replaceAll("]", ""));
            } else {
                answer.append("No permutation");
            }
            answer.append("\n");
        }
        System.out.println(answer.toString());
    }

    static void permutation(char[] words, List<Character> list) {
        if (list.size() == words.length) {
            count++;
            if (count == n) {
                value = list.toString();
            }
            return;
        }

        for (char word : words) {
            if (!list.contains(word)) {
                list.add(word);
                permutation(words, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
