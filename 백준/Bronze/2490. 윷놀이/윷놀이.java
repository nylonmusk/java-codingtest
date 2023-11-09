import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(st.nextToken());
            sum += Integer.parseInt(st.nextToken());
            sum += Integer.parseInt(st.nextToken());
            sum += Integer.parseInt(st.nextToken());
            if (sum == 3) {
                answer.append("A");
            } else if (sum == 2) {
                answer.append("B");
            } else if (sum == 1) {
                answer.append("C");
            } else if (sum == 4) {
                answer.append("E");
            } else {
                answer.append("D");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
