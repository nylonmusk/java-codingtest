import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        answer.append((int) Math.pow(2, N) - 1).append("\n");
        move(N, 1, 3, 2);
        System.out.println(answer);
    }

    private static void move(int n, int from, int to, int aux) {
        if (n == 0) {
            return;
        }
        move(n - 1, from, aux, to);
        answer.append(from + " " + to).append("\n");
        move(n - 1, aux, to, from);
    }
}
