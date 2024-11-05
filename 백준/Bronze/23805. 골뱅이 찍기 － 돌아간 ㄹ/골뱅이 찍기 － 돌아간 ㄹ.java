import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            print('@', 3 * N);
            print(' ', N);
            print('@', N);
            System.out.println();
        }

        for (int i = 0; i < 3 * N; i++) {
            print('@', N);
            print(' ', N);
            print('@', N);
            print(' ', N);
            print('@', N);
            System.out.println();
        }

        for (int i = 0; i < N; i++) {
            print('@', N);
            print(' ', N);
            print('@', 3 * N);
            System.out.println();
        }
    }

    private static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
    }
}