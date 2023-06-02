import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] alphabet;
    static boolean[] visited;
    static int R;
    static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        visited = new boolean[26];
        alphabet = new char[R + 1][C + 1];
        for (int i = 1; i <= R; i++) {
            String temp = br.readLine();
            for (int j = 1; j <= C; j++) {
                alphabet[i][j] = temp.charAt(j - 1);
            }
        }

        System.out.println(dfs(1, 1, 1));
    }

    private static int dfs(int x, int y, int count) {
        visited[alphabet[x][y] - 'A'] = true;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int maxCount = count;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx > 0 && ny > 0 && nx <= R && ny <= C && !visited[alphabet[nx][ny] - 'A']) {
                int result = dfs(nx, ny, count + 1);
                maxCount = Math.max(maxCount, result);
            }
        }
        visited[alphabet[x][y] - 'A'] = false;
        return maxCount;
    }
}