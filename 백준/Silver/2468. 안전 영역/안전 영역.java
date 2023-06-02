import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int[][] locations;
    static boolean[][] visited;
    static int N;
    static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        locations = new int[N][N];

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                locations[i][j] = Integer.parseInt(st.nextToken());
                set.add(locations[i][j]);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        int max = Integer.MIN_VALUE;
        for (int c = 0; c < list.size(); c++) {
            C = list.get(c);
            int count = 0;
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && locations[i][j] > C) {
                        count += dfs(i, j);
                    }
                }
            }
            max = Math.max(max, count);
        }
        if (max == 0) {
            System.out.println(1);
        } else {
            System.out.println(max);
        }
    }

    private static int dfs(int x, int y) {
        visited[x][y] = true;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && locations[nx][ny] > C) {
                dfs(nx, ny);
            }
        }
        return 1;
    }
}