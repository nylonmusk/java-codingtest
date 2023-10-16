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
            int sum = 0;
            int min = Integer.MAX_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= 7; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num % 2 == 0) {
                    sum += num;
                    min = Math.min(min, num);
                }
            }
            answer.append(sum + " " + min);
            answer.append("\n");
        }

        System.out.println(answer);
    }
}
