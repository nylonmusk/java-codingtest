import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static char[][] board = new char[10][10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken()) - 1;
        int c = Integer.parseInt(st.nextToken()) - 1;

        for (int i = 0; i < 10; i++) {
            String s = br.readLine();
            for (int j = 0; j < 10; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        boolean[][] affected = new boolean[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == 'o') {
                    for (int k = 0; k < 10; k++) {
                        affected[i][k] = true;
                        affected[k][j] = true;
                    }
                }
            }
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (!affected[i][j]) {
                    answer = Math.min(answer, Math.abs(r - i) + Math.abs(c - j));
                }
            }
        }

        System.out.println(answer);
    }
}