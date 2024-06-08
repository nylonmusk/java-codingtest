import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder answer = new StringBuilder();
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            answer.append(min).append(" ").append(max).append("\n");
        }

        System.out.println(answer);
    }
}
