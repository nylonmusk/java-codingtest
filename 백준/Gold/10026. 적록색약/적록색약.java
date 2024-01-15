 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int N;
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    private static char[][] colors;
    private static boolean[][] visited;
    private static boolean[][] visitedColorBlindness;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        colors = new char[N][N];
        visited = new boolean[N][N];
        visitedColorBlindness = new boolean[N][N];

        for (int j = 0; j < N; j++) {
            int index = 0;
            for (char c : br.readLine().toCharArray()) {
                colors[j][index] = c;
                index++;
            }
        }

        int countColorBlindness = 0;
        int countNormal = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (!visited[i][j]) {
                    dfs(i, j);
                    countNormal++;
                }

                if (!visitedColorBlindness[i][j]) {
                    dfsColorBlindness(i, j);
                    countColorBlindness++;
                }
            }
        }

        System.out.println(countNormal + " " + countColorBlindness);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny]) {

                if (colors[x][y] == colors[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }

    private static void dfsColorBlindness(int x, int y) {
        visitedColorBlindness[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visitedColorBlindness[nx][ny]) {
                if (colors[x][y] == colors[nx][ny] || colors[x][y] == 'R' && colors[nx][ny] == 'G' || colors[x][y] == 'G' && colors[nx][ny] == 'R') {
                    visitedColorBlindness[nx][ny] = true;
                    dfsColorBlindness(nx, ny);
                }
            }
        }
    }
}
