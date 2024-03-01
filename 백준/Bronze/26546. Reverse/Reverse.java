import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        StringBuilder answer = new StringBuilder();

        for (int index = 0; index < n; index++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            answer.append(s.substring(0, i)).append(s.substring(j)).append("\n");
        }

        System.out.println(answer);
    }
}
