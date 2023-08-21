import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (T-- > 0) {
            int money = Integer.parseInt(br.readLine());
            answer.append(money / 25).append(" ");
            money %= 25;
            answer.append(money / 10).append(" ");
            money %= 10;
            answer.append(money / 5).append(" ");
            money %= 5;
            answer.append(money).append(" ");
            answer.append("\n");
        }
        System.out.println(answer);
    }
}