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
            answer.append(s.charAt(s.length() - 1) % 2 == 0 ? "even" : "odd").append("\n");
        }
        System.out.println(answer);
    }
}
