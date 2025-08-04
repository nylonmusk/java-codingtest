import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int N, M;
    private static char[][] board;
    private static int answer = -1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        N = Integer.parseInt(firstLine[0]);
        M = Integer.parseInt(firstLine[1]);

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            board[i] = line.toCharArray();
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                for (int dr = -N; dr <= N; dr++) {
                    for (int dc = -M; dc <= M; dc++) {
                        if (dr == 0 && dc == 0) continue;

                        int nr = r, nc = c;
                        StringBuilder sb = new StringBuilder();

                        while (0 <= nr && nr < N && 0 <= nc && nc < M) {
                            sb.append(board[nr][nc]);
                            long num = Long.parseLong(sb.toString());
                            if (isPerfectSquare(num)) {
                                answer = Math.max(answer, (int)num);
                            }
                            nr += dr;
                            nc += dc;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }

    private static boolean isPerfectSquare(long x) {
        if (x < 0) {
            return false;
        }
        long sqrt = (long)Math.sqrt(x);
        return sqrt * sqrt == x;
    }
}