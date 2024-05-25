import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static int[][] map;
    private static int[][] group;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};
    private static int N, M;
    private static Map<Integer, Integer> groupSize;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        group = new int[N][M];
        groupSize = new HashMap<>();
        int groupId = 1;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j) - '0';
                group[i][j] = -1;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0 && group[i][j] == -1) {
                    bfs(i, j, groupId);
                    groupId++;
                }
            }
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1) {
                    Set<Integer> adjacentGroups = new HashSet<>();
                    int moveableCells = 1;

                    for (int index = 0; index < 4; index++) {
                        int nx = i + dx[index];
                        int ny = j + dy[index];

                        if (nx >= 0 && ny >= 0 && nx < N && ny < M && group[nx][ny] != -1) {
                            adjacentGroups.add(group[nx][ny]);
                        }
                    }

                    for (int grp : adjacentGroups) {
                        moveableCells += groupSize.get(grp);
                    }

                    answer.append(moveableCells % 10);
                } else {
                    answer.append(0);
                }
            }
            answer.append("\n");
        }
        System.out.print(answer);
    }

    private static void bfs(int x, int y, int groupId) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        group[x][y] = groupId;
        int size = 0;

        while (!queue.isEmpty()) {
            Point now = queue.poll();
            size++;

            for (int index = 0; index < 4; index++) {
                int nx = now.x + dx[index];
                int ny = now.y + dy[index];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && map[nx][ny] == 0 && group[nx][ny] == -1) {
                    group[nx][ny] = groupId;
                    queue.add(new Point(nx, ny));
                }
            }
        }
        groupSize.put(groupId, size);
    }
}
