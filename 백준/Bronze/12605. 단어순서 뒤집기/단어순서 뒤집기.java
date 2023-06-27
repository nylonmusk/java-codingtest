import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            answer.append("Case #").append(i).append(": ");
            String[] s = br.readLine().split(" ");
            for (int j = s.length - 1; j >= 0; j--) {
                answer.append(s[j]).append(" ");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
