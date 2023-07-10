import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        int i = 0;
        for (int j = 0; j < N; j++) {
            answer.append(" ".repeat(j)).append("*".repeat(2 * N - i - 1)).append("\n");
            i += 2;
        }
        System.out.println(answer);
    }
}
