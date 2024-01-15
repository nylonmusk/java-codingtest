import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    private static int[][] regions;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        regions = new int[N][N];

        int maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int height = Integer.parseInt(st.nextToken());
                regions[i][j] = height;
                maxHeight = Math.max(maxHeight, height);
            }
        }

        int height = 1;
        int answer = 0;
        while (height < maxHeight) {
            int count = 0;
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (regions[i][j] > height && !visited[i][j]) {
                        dfs(i, j, height);
                        count++;
                    }
                }
            }
            answer = Math.max(answer, count);
            height++;
        }
        System.out.println(answer == 0 ? 1 : answer);
    }

    private static void dfs(int x, int y, int height) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (!visited[nx][ny] && regions[nx][ny] > height) {
                    visited[nx][ny] = true;
                    dfs(nx, ny, height);
                }
            }
        }
    }
}
