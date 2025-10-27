import java.io.*;
import java.util.*;

public class Main {
    private static int R, C, T;
    private static int[][] map;
    private static int[] air = new int[2];
    private static int[] dr = {-1, 1, 0, 0};
    private static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        int idx = 0;
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == -1) air[idx++] = i;
            }
        }
        for (int t = 0; t < T; t++) {
            spread();
            clean();
        }
        int sum = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] > 0) sum += map[i][j];
            }
        }
        System.out.println(sum);
    }

    private static void spread() {
        int[][] tmp = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] > 0) {
                    int val = map[i][j] / 5;
                    int cnt = 0;
                    for (int d = 0; d < 4; d++) {
                        int nr = i + dr[d], nc = j + dc[d];
                        if (nr < 0 || nc < 0 || nr >= R || nc >= C || map[nr][nc] == -1) continue;
                        tmp[nr][nc] += val;
                        cnt++;
                    }
                    tmp[i][j] += map[i][j] - val * cnt;
                }
            }
        }
        tmp[air[0]][0] = tmp[air[1]][0] = -1;
        map = tmp;
    }

    private static void clean() {
        int top = air[0];
        for (int i = top - 1; i > 0; i--) map[i][0] = map[i - 1][0];
        for (int j = 0; j < C - 1; j++) map[0][j] = map[0][j + 1];
        for (int i = 0; i < top; i++) map[i][C - 1] = map[i + 1][C - 1];
        for (int j = C - 1; j > 1; j--) map[top][j] = map[top][j - 1];
        map[top][1] = 0;

        int bottom = air[1];
        for (int i = bottom + 1; i < R - 1; i++) map[i][0] = map[i + 1][0];
        for (int j = 0; j < C - 1; j++) map[R - 1][j] = map[R - 1][j + 1];
        for (int i = R - 1; i > bottom; i--) map[i][C - 1] = map[i - 1][C - 1];
        for (int j = C - 1; j > 1; j--) map[bottom][j] = map[bottom][j - 1];
        map[bottom][1] = 0;
    }
}