import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        int j = 1;
        for (int i = 0; i < N; i++) {
            answer.append(" ".repeat(i)).append("*".repeat(N * 2 - j)).append("\n");
            j += 2;
        }

        j = 1;
        for (int i = N - 2; i >= 0; i--) {
            answer.append(" ".repeat(i)).append("*".repeat(N - i + j)).append("\n");
            j++;
        }

        System.out.println(answer);
    }
}
