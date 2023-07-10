import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        int i = 1;
        for (int j = 1; j < N * 2 - 2; j += 2) {
            answer.append(" ".repeat(N - i)).append("*".repeat(j)).append("\n");
            i += 1;
        }
        i = N;
        for (int j = N * 2 - 1; j >= 1; j -= 2) {
            answer.append(" ".repeat(N - i)).append("*".repeat(j)).append("\n");
            i -= 1;
        }

        System.out.println(answer);
    }
}
