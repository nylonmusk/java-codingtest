import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] chess;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        chess = new char[N][M];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                chess[i][j] = temp.charAt(j);
            }
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int countW = checkBoard(i, j, 'W');
                int countB = checkBoard(i, j, 'B');
                int minCount = Math.min(countB, countW);
                answer = Math.min(minCount, answer);
            }
        }
        System.out.println(answer);
    }

    private static int checkBoard(int startX, int startY, char color) {
        int count = 0;
        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                if (chess[i][j] != color) {
                    count++;
                }
                color = color == 'W' ? 'B' : 'W';
            }
            color = color == 'W' ? 'B' : 'W';
        }
        return count;
    }
}