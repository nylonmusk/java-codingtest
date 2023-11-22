import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        for (String s : br.readLine().split("-")) {
            answer.append(s.charAt(0));
        }
        System.out.println(answer);
    }
}
