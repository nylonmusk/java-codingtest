import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!(line = br.readLine()).equals("#")) {
            StringTokenizer st = new StringTokenizer(line, " ");
            StringBuilder answer = new StringBuilder();

            while (st.hasMoreTokens()) {
                String word = st.nextToken();

                if (word.length() > 1) {
                    StringBuilder middle = new StringBuilder(word.substring(1, word.length() - 1));
                    answer.append(word.charAt(0)).append(middle.reverse()).append(word.charAt(word.length() - 1)).append(" ");
                } else {
                    answer.append(word).append(" ");
                }
            }

            System.out.println(answer.toString().trim());
        }
    }
}