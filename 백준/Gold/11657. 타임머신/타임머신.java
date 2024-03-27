import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Road {
    int B;
    int C;

    Road(int B, int C) {
        this.B = B;
        this.C = C;
    }
}

public class Main {
    private static int N, M;
    private static List<List<Road>> roads;
    private static long[] dist;
    private static final int INF = 987654321;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        dist = new long[N + 1];
        roads = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            roads.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            roads.get(A).add(new Road(B, C));
        }

        StringBuilder answer = new StringBuilder();

        if (bellmanFord(1)) {
            answer.append("-1\n");
        } else {
            for (int i = 2; i <= N; i++) {
                if (dist[i] == INF) {
                    answer.append("-1\n");
                } else {
                    answer.append(dist[i]).append("\n");
                }
            }
        }

        System.out.print(answer);
    }

    private static boolean bellmanFord(int start) {
        Arrays.fill(dist, INF);
        dist[start] = 0;

        for (int i = 1; i <= N - 1; i++) {
            for (int j = 1; j <= N; j++) {
                for (Road now : roads.get(j)) {
                    if (dist[j] != INF && dist[now.B] > dist[j] + now.C) {
                        dist[now.B] = dist[j] + now.C;
                    }
                }
            }
        }

        for (int j = 1; j <= N; j++) {
            for (Road now : roads.get(j)) {
                if (dist[j] != INF && dist[now.B] > dist[j] + now.C) {
                    return true;
                }
            }
        }
        return false;
    }
}
