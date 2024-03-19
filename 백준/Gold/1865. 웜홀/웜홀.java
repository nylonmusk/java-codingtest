import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Road {
    int E;
    int T;

    Road(int E, int T) {
        this.E = E;
        this.T = T;
    }
}

public class Main {
    private static int N, M, W;
    private static List<List<Road>> roads;
    private static int[] dist;
    private static final int INF = 987654321;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        while (TC-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());

            dist = new int[N + 1];

            roads = new ArrayList<>();
            for (int i = 0; i <= N; i++) {
                roads.add(new ArrayList<>());
            }
            for (int i = 2; i <= M + 1; i++) {
                st = new StringTokenizer(br.readLine());
                int S = Integer.parseInt(st.nextToken());
                int E = Integer.parseInt(st.nextToken());
                int T = Integer.parseInt(st.nextToken());
                roads.get(S).add(new Road(E, T));
                roads.get(E).add(new Road(S, T));
            }

            for (int i = M + 2; i <= M + W + 1; i++) {
                st = new StringTokenizer(br.readLine());
                int S = Integer.parseInt(st.nextToken());
                int E = Integer.parseInt(st.nextToken());
                int T = Integer.parseInt(st.nextToken());
                roads.get(S).add(new Road(E, -T));
            }

            boolean isValid = false;
            for (int i = 1; i <= N; i++) {
                if (bellmanFord(i)) {
                    isValid = true;
                    break;
                }
            }
            answer.append(isValid ? "YES" : "NO").append("\n");
        }
        System.out.println(answer);
    }

    private static boolean bellmanFord(int start) {
        Arrays.fill(dist, INF);
        dist[start] = 0;
        boolean update = false;

        for (int i = 1; i < N; i++) {
            update = false;

            for (int j = 1; j <= N; j++) {
                for (Road now : roads.get(j)) {
                    if (dist[j] != INF && dist[now.E] > dist[j] + now.T) {
                        dist[now.E] = dist[j] + now.T;
                        update = true;
                    }
                }

            }
            if (!update) break;
        }

        if (update) {
            for (int i = 1; i <= N; i++) {
                for (Road now : roads.get(i)) {
                    if (dist[i] != INF && dist[now.E] > dist[i] + now.T) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
