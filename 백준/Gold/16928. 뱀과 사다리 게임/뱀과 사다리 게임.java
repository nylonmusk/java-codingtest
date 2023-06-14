import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    private static int N;
    private static int M;
    private static Map<Integer, Integer> ladders = new HashMap<>();
    private static Map<Integer, Integer> snakes = new HashMap<>();
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            ladders.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            snakes.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        visited = new boolean[101];
        System.out.println(bfs(1));
    }

    private static int bfs(int start) {
        int min = Integer.MAX_VALUE;
        visited[start] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, 0});
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int current = temp[0];
            int count = temp[1];
            if (current == 100) {
                min = Math.min(min, count);
            }
            for (int i = 1; i <= 6; i++) {
                if (current + i <= 100 && !visited[current + i]) {
                    visited[current + i] = true;
                    if (ladders.containsKey(current + i)) {
                        int result = ladders.get(current + i);
                        queue.offer(new int[]{result, count + 1});
                    } else if (snakes.containsKey(current + i)) {
                        int result = snakes.get(current + i);
                        queue.offer(new int[]{result, count + 1});
                    } else {
                        queue.offer(new int[]{current + i, count + 1});
                    }
                }
            }
        }
        return min;
    }
}
