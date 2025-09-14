import java.io.*;
import java.util.*;

public class Main {
    private static int N;
    private static int[][] S;
    private static boolean[] visited;
    private static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        S = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combination(0, 0);
        System.out.println(minDiff);
    }

    private static void combination(int idx, int count) {
        if (count == N / 2) {
            calculate();
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination(i + 1, count + 1);
                visited[i] = false;
            }
        }
    }

    private static void calculate() {
        int start = 0, link = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    start += S[i][j] + S[j][i];
                } else if (!visited[i] && !visited[j]) {
                    link += S[i][j] + S[j][i];
                }
            }
        }
        int diff = Math.abs(start - link);
        minDiff = Math.min(minDiff, diff);
    }
}