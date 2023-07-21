import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (i % 10 == 0 && i != 0) {
                answer.append("\n").append(str.charAt(i));
            } else {
                answer.append(str.charAt(i));
            }
        }
        System.out.println(answer);
    }
}
