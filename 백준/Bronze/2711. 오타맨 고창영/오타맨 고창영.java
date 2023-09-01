import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken()) - 1;
            String s = st.nextToken();

            for (int i = 0; i < s.length(); i++) {
                if (index != i) {
                    answer.append(s.charAt(i));
                }
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}