import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        int j = 2;
        for (int i = 1; i <= N; i++) {
            answer.append("*".repeat(i)).append(" ".repeat(N * 2 - j)).append("*".repeat(i)).append("\n");
            j += 2;
        }

        j = 1;
        for (int i = N - 1; i >= 1; i--) {
            answer.append("*".repeat(i)).append(" ".repeat(N - i + j)).append("*".repeat(i)).append("\n");
            j++;
        }

        System.out.println(answer);
    }
}
