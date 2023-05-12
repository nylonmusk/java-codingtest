import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static boolean[][] visited;
    static boolean[][] cabbage;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            visited = new boolean[M][N];
            cabbage = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                String s = br.readLine();
                int a = Integer.parseInt(s.split(" ")[0]);
                int b = Integer.parseInt(s.split(" ")[1]);
                cabbage[a][b] = true;
            }
            int count = 0;
            for (int l = 0; l < M; l++) {
                for (int m = 0; m < N; m++) {
                    if (!visited[l][m] && cabbage[l][m]) {
                        dfs(l, m);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs(int x, int y) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < M && ny < N && cabbage[nx][ny] && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}
