import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < N; i++) {
            appendChars(answer, '@', 5 * N);
            answer.append('\n');
        }

        for (int i = 0; i < N; i++) {
            appendChars(answer, '@', N);
            answer.append('\n');
        }

        for (int i = 0; i < N; i++) {
            appendChars(answer, '@', 5 * N);
            answer.append('\n');
        }

        for (int i = 0; i < N; i++) {
            appendChars(answer, '@', N);
            answer.append('\n');
        }

        for (int i = 0; i < N; i++) {
            appendChars(answer, '@', N);
            answer.append('\n');
        }

        System.out.print(answer);
    }

    private static void appendChars(StringBuilder sb, char ch, int count) {
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
    }
}