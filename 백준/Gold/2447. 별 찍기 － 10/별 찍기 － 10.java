import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] arr = new char[N][N];
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < N; i++) {
            Arrays.fill(arr[i], ' ');
        }

        star(0, 0, N, arr);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                answer.append(arr[i][j]);
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }

    static void star(int x, int y, int n, char[][] arr) {
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i == 1 && j == 1)) {
                    star(x + i * (n / 3), y + j * (n / 3), n / 3, arr);
                }
            }
        }
    }
}