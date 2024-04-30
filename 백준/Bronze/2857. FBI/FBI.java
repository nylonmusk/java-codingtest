import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            String s = br.readLine();
            String newS = s.replaceAll("FBI", "");
            if (s.length() != newS.length()) {
                answer.append(i).append(" ");
            }
        }
        System.out.println(answer.length() == 0 ? "HE GOT AWAY!" : answer);
    }
}
