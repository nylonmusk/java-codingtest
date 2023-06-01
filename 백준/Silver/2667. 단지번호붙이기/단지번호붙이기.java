import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    static boolean[][] visited;
    static boolean[][] house;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];
        house = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                if (s.charAt(j) == '1') {
                    house[i][j] = true;
                }
            }
        }
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && house[i][j]) {
                    answer.add(bfs(i, j));
                }
            }
        }
        Collections.sort(answer);
        sb.append(answer.size()).append("\n");
        for (int i = 0; i < answer.size(); i++) {
            if (i != answer.size() - 1) {
                sb.append(answer.get(i)).append("\n");
            } else {
                sb.append(answer.get(i));
            }
        }
        System.out.println(sb);
    }

    public static int bfs(int x, int y) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        visited[x][y] = true;
        int count = 1;
        Queue<int[]> q = new LinkedList<>();
        int[] temp = {x, y};
        q.add(temp);

        while (!q.isEmpty()) {
            int[] t = q.poll();
            x = t[0];
            y = t[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && house[nx][ny]) {
                    int[] tt = new int[2];
                    tt[0] = nx;
                    tt[1] = ny;
                    visited[nx][ny] = true;
                    count++;
                    q.add(tt);
                }
            }
        }
        return count;
    }
}