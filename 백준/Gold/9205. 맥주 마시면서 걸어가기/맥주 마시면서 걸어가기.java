import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int homeX;
    static int homeY;
    static int festivalX;
    static int festivalY;
    static int[][] convenientStore;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            convenientStore = new int[n][2];
            visited = new boolean[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            homeX = Integer.parseInt(st.nextToken());
            homeY = Integer.parseInt(st.nextToken());
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                convenientStore[i][0] = Integer.parseInt(st.nextToken());
                convenientStore[i][1] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            festivalX = Integer.parseInt(st.nextToken());
            festivalY = Integer.parseInt(st.nextToken());

            answer.append(bfs()).append("\n");
        }
        System.out.println(answer);
    }

    static String bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{homeX, homeY});
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            if (Math.abs(x - festivalX) + Math.abs(y - festivalY) <= 1000) {
                return "happy";
            }

            for (int i = 0; i < n; i++) {
                int nextX = convenientStore[i][0];
                int nextY = convenientStore[i][1];
                if (!visited[i] && Math.abs(x - nextX) + Math.abs(y - nextY) <= 1000) {
                    visited[i] = true;
                    queue.offer(new int[]{nextX, nextY});
                }
            }
        }
        return "sad";
    }
}