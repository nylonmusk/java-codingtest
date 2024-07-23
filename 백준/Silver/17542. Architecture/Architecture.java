import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] eastSkyline = new int[R];
        for (int i = 0; i < R; i++) {
            eastSkyline[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] northSkyline = new int[C];
        for (int j = 0; j < C; j++) {
            northSkyline[j] = Integer.parseInt(st.nextToken());
        }

        int[][] grid = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = Math.min(eastSkyline[i], northSkyline[j]);
            }
        }

        boolean isPossible = true;

        for (int i = 0; i < R; i++) {
            int maxInRow = 0;
            for (int j = 0; j < C; j++) {
                maxInRow = Math.max(maxInRow, grid[i][j]);
            }
            if (maxInRow != eastSkyline[i]) {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            for (int j = 0; j < C; j++) {
                int maxInCol = 0;
                for (int i = 0; i < R; i++) {
                    maxInCol = Math.max(maxInCol, grid[i][j]);
                }
                if (maxInCol != northSkyline[j]) {
                    isPossible = false;
                    break;
                }
            }
        }

        System.out.println(isPossible ? "possible" : "impossible");
    }
}