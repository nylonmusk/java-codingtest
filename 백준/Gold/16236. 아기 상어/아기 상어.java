import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int sharkX;
    static int sharkY;
    static int sharkSize = 2;
    static int eatCnt;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int answer;
    static boolean[][] visited;

    static class Position {
        int x;
        int y;
        int distance;

        Position(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] != 0) {
                    if (map[i][j] == 9) {
                        sharkX = i;
                        sharkY = j;
                        map[i][j] = 0;
                    }
                }
            }
        }

        Queue<Position> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.distance == o2.distance) {
                if (o1.x == o2.x) {
                    return Integer.compare(o1.y, o2.y);
                }
                return Integer.compare(o1.x, o2.x);
            }
            return Integer.compare(o1.distance, o2.distance);
        });

        queue.add(new Position(sharkX, sharkY, 0));
        visited = new boolean[n][n];
        visited[sharkX][sharkY] = true;

        while (!queue.isEmpty()) {
            Position now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int moveX = now.x + dx[i];
                int moveY = now.y + dy[i];

                if (moveX >= 0 && moveY >= 0 && moveX < n && moveY < n && !visited[moveX][moveY]) {
                    visited[moveX][moveY] = true;

                    if (map[moveX][moveY] <= sharkSize) {
                        queue.add(new Position(moveX, moveY, now.distance + 1));
                    }
                }
            }

            if (queue.peek() != null) {
                Position peek = queue.peek();
                if (map[peek.x][peek.y] < sharkSize && map[peek.x][peek.y] > 0) {
                    eatCnt++;
                    if (eatCnt == sharkSize) {
                        sharkSize++;
                        eatCnt = 0;
                    }
                    map[peek.x][peek.y] = 0;
                    queue.clear();
                    queue.add(new Position(peek.x, peek.y, 0));
                    answer += peek.distance;
                    visited = new boolean[n][n];
                    visited[peek.x][peek.y] = true;
                }
            }
        }

        System.out.println(answer);
    }
}