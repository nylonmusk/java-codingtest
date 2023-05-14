import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static String[][] rgb;
    static boolean[][] visited;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1][N + 1];
        rgb = new String[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            String temp = br.readLine();
            for (int j = 1; j <= N; j++) {
                char c = temp.charAt(j - 1);
                if (c == 'R') {
                    rgb[i][j] = "R";
                } else if (c == 'G') {
                    rgb[i][j] = "G";
                } else {
                    rgb[i][j] = "B";
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (!visited[i][j]) {
                    count++;
                    dfs(i, j);
                }
            }
        }

        sb.append(count).append(" ");
        visited = new boolean[N + 1][N + 1];
        count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (!visited[i][j]) {
                    count++;
                    dfsRGB(i, j);
                }
            }
        }
        sb.append(count);
        System.out.println(sb);
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx > 0 && ny > 0 && nx <= N && ny <= N && !visited[nx][ny] && rgb[nx][ny].equals(rgb[x][y])) {
                visited[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }

    public static void dfsRGB(int x, int y) {
        visited[x][y] = true;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx > 0 && ny > 0 && nx <= N && ny <= N && !visited[nx][ny]) {
                if (rgb[x][y].equals("R") || rgb[x][y].equals("G")) {
                    if (rgb[nx][ny].equals("R") || rgb[nx][ny].equals("G")) {
                        dfsRGB(nx, ny);
                    }
                }
                if (rgb[x][y].equals("B")) {
                    if (rgb[nx][ny].equals(rgb[x][y])) {
                        dfsRGB(nx, ny);
                    }
                }
            }
        }
    }
}