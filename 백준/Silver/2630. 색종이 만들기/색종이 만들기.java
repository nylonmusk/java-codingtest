import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] paper;
    private static int whiteCount;
    private static int blueCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dividePaper(0, 0, N);
        System.out.println(whiteCount + "\n" + blueCount);
    }

    private static void dividePaper(int x, int y, int size) {
        if (checkColor(x, y, size)) {
            if (paper[x][y] == 0) {
                whiteCount++;
            } else {
                blueCount++;
            }
            return;
        }
        dividePaper(x, y, size / 2);
        dividePaper(x, y + size / 2, size / 2);
        dividePaper(x + size / 2, y, size / 2);
        dividePaper(x + size / 2, y + size / 2, size / 2);
    }

    private static boolean checkColor(int x, int y, int size) {
        int color = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}