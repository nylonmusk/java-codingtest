import java.io.*;
import java.util.*;

public class Main {
    private static char[][] map = new char[12][6];
    private static boolean[][] visited = new boolean[12][6];
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 12; i++) map[i] = br.readLine().toCharArray();
        int chain = 0;

        while (true) {
            boolean exploded = false;
            visited = new boolean[12][6];
            List<int[]> removeList = new ArrayList<>();

            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 6; j++) {
                    if (map[i][j] != '.' && !visited[i][j]) {
                        List<int[]> group = bfs(i, j);
                        if (group.size() >= 4) {
                            exploded = true;
                            removeList.addAll(group);
                        }
                    }
                }
            }

            if (!exploded) break;
            for (int[] p : removeList) map[p[0]][p[1]] = '.';
            drop();
            chain++;
        }

        System.out.println(chain);
    }

    private static List<int[]> bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        List<int[]> group = new ArrayList<>();
        char color = map[x][y];
        visited[x][y] = true;
        q.add(new int[]{x, y});
        group.add(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];

                if (nx < 0 || nx >= 12 || ny < 0 || ny >= 6) continue;
                if (!visited[nx][ny] && map[nx][ny] == color) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                    group.add(new int[]{nx, ny});
                }
            }
        }
        return group;
    }

    private static void drop() {
        for (int col = 0; col < 6; col++) {
            int write = 11;
            for (int row = 11; row >= 0; row--) {
                if (map[row][col] != '.') {
                    char temp = map[row][col];
                    map[row][col] = '.';
                    map[write][col] = temp;
                    write--;
                }
            }
        }
    }
}