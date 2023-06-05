import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int[][] map;
    static int[][] answer;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        answer = new int[n][m];
        visited = new boolean[n][m];
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    startX = i;
                    startY = j;
                }
            }
        }
        bfs(startX, startY, 0);
        checkUnreachable();
        printAnswer();
    }
    
    private static void bfs(int x, int y, int d) {
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        int[] temp = {x, y, d};
        queue.add(temp);
        while (!queue.isEmpty()) {
            int[] temp2 = queue.poll();
            int a = temp2[0];
            int b = temp2[1];
            int c = temp2[2];
            answer[a][b] = c;
            for (int i = 0; i < 4; i++) {
                int nx = a + dx[i];
                int ny = b + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && map[nx][ny] != 0) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, c + 1});
                }
            }
        }
    }

    private static void checkUnreachable() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1 && answer[i][j] == 0) {
                    answer[i][j] = -1;
                }
            }
        }
    }

    private static void printAnswer() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}