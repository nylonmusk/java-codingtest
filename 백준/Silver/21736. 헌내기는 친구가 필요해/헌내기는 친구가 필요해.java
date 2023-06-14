import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int M;
    static boolean[][] visited;
    static String[][] campus;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N][M];
        campus = new String[N][M];
        int X = 0, Y = 0;
        for (int i = 0; i < N; i++) {
            int j = 0;
            for (String s : br.readLine().split("")) {
                campus[i][j] = s;
                if (s.equals("I")) {
                    X = i;
                    Y = j;
                }
                j++;
            }
        }
        int answer = bfs(X, Y);
        if (answer != 0) {
            System.out.println(answer);
        } else {
            System.out.println("TT");
        }
    }

    private static int bfs(int X, int Y) {
        visited[X][Y] = true;
        int count = 0;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{X, Y});
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int xx = temp[0];
            int yy = temp[1];
            for (int i = 0; i < 4; i++) {
                int nx = xx + dx[i];
                int ny = yy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && !visited[nx][ny]) {
                    if (campus[nx][ny].equals("O")) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    } else if (campus[nx][ny].equals("P")) {
                        count++;
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    } else {
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return count;
    }
}
