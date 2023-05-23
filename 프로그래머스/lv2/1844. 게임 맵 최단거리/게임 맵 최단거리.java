import java.util.Queue;
import java.util.LinkedList;

class Solution {
    static boolean[][] visited;
    static int[][] count;
    static int N, M;
    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        visited = new boolean[N][M];
        count = new int[N][M];
        count[0][0] = 1;
        
        return bfs(maps);
    }
    
    private static int bfs(int[][] maps) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        visited[0][0] = true;
        Queue<int[]> queue = new LinkedList<>();
        int[] temp = {0, 0};
        queue.add(temp);

        while (!queue.isEmpty()) {
            int[] temp2 = queue.poll();
            int x = temp2[0];
            int y = temp2[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M && !visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    int[] temp3 = {nx, ny};
                    count[nx][ny] = count[x][y] + 1;
                    queue.add(temp3);
                }
                if (nx == N-1 && ny == M-1) {
                    return count[nx][ny];
                }
            }
        }
        return -1;
    }
}