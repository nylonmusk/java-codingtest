import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int nextN = Integer.parseInt(s) + 1;
            int N = Integer.parseInt(s.substring(2, s.length()));
            answer.append(nextN % N == 0 ? "Good" : "Bye").append("\n");
        }
        System.out.println(answer);
    }
}
