import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (N-- > 0) {
            String s = br.readLine();
            if (s.length() >= 6 && s.length() <= 9) {
                answer.append("yes");
            } else {
                answer.append("no");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}