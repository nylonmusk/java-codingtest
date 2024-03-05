import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            backtracking(1, 1, 1, 0, "1");
            answer.append("\n");
        }

        System.out.println(answer);
    }

    private static void backtracking(int now, int num, int operator, int sum, String s) {
        if (now == N) {
            sum = sum + num * operator;
            if (sum == 0) {
                answer.append(s).append("\n");
            }
            return;
        }

        backtracking(now + 1, num * 10 + (now + 1), operator, sum, s + " " + (now + 1));
        backtracking(now + 1, now + 1, 1, sum + (num * operator), s + "+" + (now + 1));
        backtracking(now + 1, now + 1, -1, sum + (num * operator), s + "-" + (now + 1));
    }
}
