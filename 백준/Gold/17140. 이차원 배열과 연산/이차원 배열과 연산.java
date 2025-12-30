import java.io.*;
import java.util.*;

public class Main {
    private static int r, c, k;
    private static int[][] a = new int[101][101];
    private static int row = 3, col = 3;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken()) - 1;
        c = Integer.parseInt(st.nextToken()) - 1;
        k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int t = 0; t <= 100; t++) {
            if (r < row && c < col && a[r][c] == k) {
                System.out.println(t);
                return;
            }
            if (t == 100) break;
            if (row >= col) R();
            else C();
        }
        System.out.println(-1);
    }

    private static void R() {
        int maxCol = 0;
        for (int i = 0; i < row; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < col; j++) {
                if (a[i][j] == 0) continue;
                map.put(a[i][j], map.getOrDefault(a[i][j], 0) + 1);
            }
            List<int[]> list = new ArrayList<>();
            for (int key : map.keySet()) {
                list.add(new int[]{key, map.get(key)});
            }
            list.sort((o1, o2) -> {
                if (o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            });
            int idx = 0;
            for (int[] p : list) {
                if (idx >= 100) break;
                a[i][idx++] = p[0];
                if (idx >= 100) break;
                a[i][idx++] = p[1];
            }
            for (int j = idx; j < 100; j++) a[i][j] = 0;
            maxCol = Math.max(maxCol, idx);
        }
        col = Math.min(100, maxCol);
    }

    private static void C() {
        int maxRow = 0;
        for (int j = 0; j < col; j++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < row; i++) {
                if (a[i][j] == 0) continue;
                map.put(a[i][j], map.getOrDefault(a[i][j], 0) + 1);
            }
            List<int[]> list = new ArrayList<>();
            for (int key : map.keySet()) {
                list.add(new int[]{key, map.get(key)});
            }
            list.sort((o1, o2) -> {
                if (o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            });
            int idx = 0;
            for (int[] p : list) {
                if (idx >= 100) break;
                a[idx++][j] = p[0];
                if (idx >= 100) break;
                a[idx++][j] = p[1];
            }
            for (int i = idx; i < 100; i++) a[i][j] = 0;
            maxRow = Math.max(maxRow, idx);
        }
        row = Math.min(100, maxRow);
    }
}