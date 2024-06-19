import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int max = 0;
            for (int j = 0; j < 5; j++) {
                max = Math.max(max, Integer.parseInt(st.nextToken()));
            }
            answer.append("Case #").append(i).append(": ").append(max).append("\n");
        }

        System.out.println(answer);
    }
}
