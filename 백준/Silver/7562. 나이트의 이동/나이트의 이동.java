import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int l;
    static int[][] board;

    static class Knight {
        int x;
        int y;
        int count;

        Knight(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stock = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            l = Integer.parseInt(br.readLine());
            board = new int[l][l];

            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            stock.append(bfs(startX, startY, endX, endY)).append("\n");
        }
        System.out.println(stock);
    }

    private static int bfs(int startX, int startY, int endX, int endY) {
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        boolean[][] visited = new boolean[l][l];
        visited[startX][startY] = true;

        Queue<Knight> queue = new LinkedList<>();
        queue.offer(new Knight(startX, startY, 0));
        while (!queue.isEmpty()) {
            Knight knight = queue.poll();
            int x = knight.x;
            int y = knight.y;
            int count = knight.count;
            if (x == endX && y == endY) {
                return count;
            }

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < l && ny < l && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new Knight(nx, ny, count + 1));
                }
            }
        }
        return 17399712;
    }
}
