import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
    int x;
    int y;
    int count;

    Point(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
    
    @Override
    public int compareTo(Point o) {
        return this.count - o.count;
    }
}

class Main {
    static int N;
    static int M;
    static boolean[][] visited;
    static int[][] rooms;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        rooms = new int[M + 1][N + 1];
        for (int i = 1; i <= M; i++) {
            String[] temp = br.readLine().split("");
            for (int j = 1; j <= N; j++) {
                rooms[i][j] = Integer.parseInt(temp[j - 1]);
            }
        }

        System.out.println(bfs());
    }

    static int bfs() {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        visited = new boolean[M + 1][N + 1];
        visited[1][1] = true;
        PriorityQueue<Point> queue = new PriorityQueue<>();
        queue.offer(new Point(1, 1, 0));
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.x;
            int y = point.y;
            int count = point.count;

            if (x == M && y == N) {
                return count;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx > 0 && ny > 0 && nx <= M && ny <= N && !visited[nx][ny]) {
                    if (rooms[nx][ny] == 1) {
                        queue.offer(new Point(nx, ny, count + 1));
                    } else if (rooms[nx][ny] == 0) {
                        queue.offer(new Point(nx, ny, count));
                    }
                    visited[nx][ny] = true;

                }
            }
        }
        return 0;
    }
}
