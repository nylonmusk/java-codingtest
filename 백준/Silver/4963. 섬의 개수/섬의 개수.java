import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] islands;
    static boolean[][] visited;
    static int w;
    static int h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) {
                break;
            }

            int count = 0;
            islands = new int[h][w];
            visited = new boolean[h][w];

            for (int j = 0; j < h; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int i = 0; i < w; i++) {
                    islands[j][i] = Integer.parseInt(st.nextToken());
                }
            }

            for (int j = 0; j < h; j++) {
                for (int i = 0; i < w; i++) {
                    if (!visited[j][i] && islands[j][i] == 1) {
                        count += dfs(j, i);
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    private static int dfs(int x, int y) {
        visited[x][y] = true;
        int[] dx = {1, -1, 0, 0, 1, -1, 1, -1};
        int[] dy = {0, 0, 1, -1, 1, -1, -1, 1};

        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < h && ny < w && !visited[nx][ny] && islands[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
        return 1;
    }
}