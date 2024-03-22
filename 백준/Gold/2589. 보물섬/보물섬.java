import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Point {
    int x;
    int y;
    int distance;

    Point(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}

public class Main {
    static int L, W, answer;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] isVisited;
    static char[][] island;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        island = new char[L][W];

        for (int i = 0; i < L; i++) {
            int j = 0;
            for (char c : br.readLine().toCharArray()) {
                island[i][j] = c;
                j++;
            }
        }

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < W; j++) {
                if (island[i][j] == 'L') {
                    isVisited = new boolean[L][W];
                    bfs(new Point(i, j, 0));
                }
            }
        }

        System.out.println(answer);
    }

    private static void bfs(Point point) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(point);
        isVisited[point.x][point.y] = true;

        while (!queue.isEmpty()) {
            Point now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < L && ny < W && !isVisited[nx][ny] && island[nx][ny] == 'L') {
                    isVisited[nx][ny] = true;
                    queue.offer(new Point(nx, ny, now.distance + 1));
                    answer = Math.max(answer, now.distance + 1);
                }
            }
        }
    }
}