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
    static boolean[][] friends;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        friends = new boolean[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            friends[A][B] = friends[B][A] = true;
        }

        int min = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= N; j++) {
                visited = new boolean[N + 1][N + 1];
                int count = bfs(i, j);
                sum += count;
            }
            if (sum < min) {
                answer = i;
                min = sum;
            }
        }
        System.out.println(answer);
    }

    private static int bfs(int start, int target) {
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int p = temp[0];
            count = temp[1];
            if (p == target) {
                break;
            }
            for (int i = 1; i <= N; i++) {
                if (!visited[p][i] && friends[p][i]) {
                    visited[p][i] = visited[i][p] = true;
                    queue.add(new int[]{i, count + 1});
                }
            }
        }
        return count;
    }
}
