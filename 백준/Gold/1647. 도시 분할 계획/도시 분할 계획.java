import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Road implements Comparable<Road> {
    int A;
    int B;
    int C;

    Road(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public int compareTo(Road o) {
        return C - o.C;
    }

}

public class Main {
    static int[] parent;
    static List<Road> roads = new ArrayList<>();

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            roads.add(new Road(start, end, weight));
        }

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        Collections.sort(roads);

        int answer = 0;
        int bigCost = 0;
        for (Road road : roads) {
            if (find(road.A) != find(road.B)) {
                answer += road.C;
                union(road.A, road.B);

                bigCost = road.C;
            }
        }
        System.out.println(answer - bigCost);
    }

    public static int find(int x) {
        if (x == parent[x]) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) {
            parent[y] = x;
        }
    }
}