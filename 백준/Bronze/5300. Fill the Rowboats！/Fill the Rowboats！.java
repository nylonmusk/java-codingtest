import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= X; i++) {
            answer.append(i).append(" ");
            if (i % 6 == 0) {
                answer.append("Go! ");
            }
        }
        if (!answer.toString().endsWith("Go! ")) answer.append("Go!");
        System.out.println(answer);
    }
}
