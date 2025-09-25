import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long R = Long.parseLong(st.nextToken());
        double D = Double.parseDouble(st.nextToken());
        long ex = Long.parseLong(st.nextToken());
        long ey = Long.parseLong(st.nextToken());

        long[] x = new long[N];
        long[] y = new long[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Long.parseLong(st.nextToken());
            y[i] = Long.parseLong(st.nextToken());
        }

        long R2 = R * R;
        boolean[] attackable = new boolean[N];
        for (int i = 0; i < N; i++) {
            long dx = x[i] - ex;
            long dy = y[i] - ey;
            if (dx*dx + dy*dy <= R2) attackable[i] = true;
        }

        List<Integer>[] adj = new ArrayList[N];
        for (int i = 0; i < N; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                long dx = x[i] - x[j];
                long dy = y[i] - y[j];
                if (dx*dx + dy*dy <= R2) {
                    adj[i].add(j);
                    adj[j].add(i);
                }
            }
        }

        int[] dist = new int[N];
        Arrays.fill(dist, -1);
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if (attackable[i]) {
                dist[i] = 0;
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj[u]) {
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    q.add(v);
                }
            }
        }

        double answer = 0.0;
        for (int i = 0; i < N; i++) {
            if (dist[i] != -1) {
                answer += D * Math.pow(0.5, dist[i]);
            }
        }

        System.out.printf("%.10f\n", answer);
    }
}
