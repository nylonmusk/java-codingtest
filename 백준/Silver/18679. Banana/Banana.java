import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Map<String, String> words = new HashMap<>();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " = ");
            words.put(st.nextToken(), st.nextToken());
        }

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int length = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < length; i++) {
                answer.append(words.get(st.nextToken())).append(" ");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
