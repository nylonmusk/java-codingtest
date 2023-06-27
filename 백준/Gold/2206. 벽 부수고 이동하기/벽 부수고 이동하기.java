import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Wall {
    int x;
    int y;
    int count;
    int distance;

    Wall(int x, int y, int count, int distance) {
        this.x = x;
        this.y = y;
        this.count = count;
        this.distance = distance;
    }
}

public class Main {
    static int N;
    static int M;
    static int[][] map;
    static int[][][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new int[N][M][2];
        for (int i = 0; i < N; i++) {
            int j = 0;
            for (String s : br.readLine().split("")) {
                map[i][j] = Integer.parseInt(s);
                visited[i][j][0] = Integer.MAX_VALUE;
                visited[i][j][1] = Integer.MAX_VALUE;
                j++;
            }
        }

        int answer = bfs();
        System.out.println(answer);
    }

    private static int bfs() {
        Queue<Wall> queue = new LinkedList<>();
        queue.offer(new Wall(0, 0, 0, 1));
        visited[0][0][0] = 1;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            Wall wall = queue.poll();
            int x = wall.x;
            int y = wall.y;
            int count = wall.count;
            int distance = wall.distance;

            if (x == N - 1 && y == M - 1) {
                return distance;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (map[nx][ny] == 0 && visited[nx][ny][count] > distance) {
                        visited[nx][ny][count] = distance;
                        queue.offer(new Wall(nx, ny, count, distance + 1));
                    } else if (map[nx][ny] == 1 && count == 0 && visited[nx][ny][count + 1] > distance) {
                        visited[nx][ny][count + 1] = distance;
                        queue.offer(new Wall(nx, ny, 1, distance + 1));
                    }
                }
            }
        }
        return -1;
    }
}
