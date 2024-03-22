import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int R, C;
    static char[][] maze;
    static boolean[][] isVisited;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new char[R][C];
        isVisited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            maze[i] = br.readLine().toCharArray();
        }

        int answer = escapeMaze();
        System.out.println(answer == -1 ? "IMPOSSIBLE" : answer);
    }

    static int escapeMaze() {
        Queue<Point> jQueue = new LinkedList<>();
        Queue<Point> fQueue = new LinkedList<>();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (maze[i][j] == 'J') {
                    jQueue.offer(new Point(i, j));
                    isVisited[i][j] = true;
                } else if (maze[i][j] == 'F') {
                    fQueue.offer(new Point(i, j));
                }
            }
        }

        int time = 0;

        while (!jQueue.isEmpty()) {
            spreadFire(fQueue);

            int size = jQueue.size();
            for (int i = 0; i < size; i++) {
                Point now = jQueue.poll();

                if (now.x == 0 || now.y == 0 || now.x == R - 1 || now.y == 0 || now.y == C - 1) {
                    return time + 1;
                }

                for (int d = 0; d < 4; d++) {
                    int nx = now.x + dx[d];
                    int ny = now.y + dy[d];

                    if (nx >= 0 && nx < R && ny >= 0 && ny < C && maze[nx][ny] == '.' && !isVisited[nx][ny]) {
                        isVisited[nx][ny] = true;
                        jQueue.offer(new Point(nx, ny));
                    }
                }
            }

            time++;
        }

        return -1;
    }

    static void spreadFire(Queue<Point> fQueue) {
        int size = fQueue.size();
        for (int i = 0; i < size; i++) {
            Point now = fQueue.poll();

            for (int d = 0; d < 4; d++) {
                int nx = now.x + dx[d];
                int ny = now.y + dy[d];

                if (nx >= 0 && nx < R && ny >= 0 && ny < C && maze[nx][ny] == '.') {
                    maze[nx][ny] = 'F';
                    fQueue.offer(new Point(nx, ny));
                }
            }
        }
    }
}
