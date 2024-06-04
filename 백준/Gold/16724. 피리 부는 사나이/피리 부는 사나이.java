import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static char[][] map;
    private static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        parent = new int[N * M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < N * M; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int current = i * M + j;
                int next = getNext(current);
                union(current, next);
            }
        }

        int answer = 0;
        for (int i = 0; i < N * M; i++) {
            if (parent[i] == i) {
                answer++;
            }
        }

        System.out.print(answer);
    }

    private static int getNext(int current) {
        int x = current / M;
        int y = current % M;
        char direction = map[x][y];

        if (direction == 'U') {
            x--;
        } else if (direction == 'D') {
            x++;
        } else if (direction == 'L') {
            y--;
        } else if (direction == 'R') {
            y++;
        }

        return x * M + y;
    }

    private static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA != rootB) {
            parent[rootB] = rootA;
        }
    }

    private static int find(int a) {
        if (parent[a] == a) {
            return a;
        }
        return parent[a] = find(parent[a]);
    }
}
