import java.io.*;
import java.util.*;

public class Main {
    private static int N, L;
    private static int[][] map;

    private static boolean check(int[] road) {
        boolean[] used = new boolean[N];

        for (int i = 0; i < N - 1; i++) {
            int diff = road[i] - road[i + 1];

            if (diff == 0) continue;

            if (diff == 1) {
                for (int j = i + 1; j <= i + L; j++) {
                    if (j >= N || road[j] != road[i + 1] || used[j]) return false;
                    used[j] = true;
                }
            } else if (diff == -1) {
                for (int j = i; j > i - L; j--) {
                    if (j < 0 || road[j] != road[i] || used[j]) return false;
                    used[j] = true;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;

        for (int i = 0; i < N; i++) {
            int[] row = new int[N];
            int[] col = new int[N];

            for (int j = 0; j < N; j++) {
                row[j] = map[i][j];
                col[j] = map[j][i];
            }

            if (check(row)) answer++;
            if (check(col)) answer++;
        }

        System.out.println(answer);
    }
}