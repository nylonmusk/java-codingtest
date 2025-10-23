import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine().trim());
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) board[i][j] = Integer.parseInt(st.nextToken());
        }
        dfs(board, 0);
        System.out.println(answer);
    }

    private static void dfs(int[][] b, int depth) {
        for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) answer = Math.max(answer, b[i][j]);
        if (depth == 5) return;
        for (int dir = 0; dir < 4; dir++) {
            int[][] nb = move(b, dir);
            dfs(nb, depth + 1);
        }
    }

    private static int[][] move(int[][] b, int dir) {
        int[][] res = new int[N][N];
        for (int i = 0; i < N; i++) res[i] = Arrays.copyOf(b[i], N);
        if (dir == 0) return moveUp(res);
        if (dir == 1) return moveDown(res);
        if (dir == 2) return moveLeft(res);
        return moveRight(res);
    }

    private static int[][] moveUp(int[][] a) {
        int[][] b = new int[N][N];
        for (int j = 0; j < N; j++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) if (a[i][j] != 0) list.add(a[i][j]);
            ArrayList<Integer> merged = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (i + 1 < list.size() && list.get(i).equals(list.get(i + 1))) {
                    merged.add(list.get(i) * 2);
                    i++;
                } else merged.add(list.get(i));
            }
            for (int i = 0; i < merged.size(); i++) b[i][j] = merged.get(i);
        }
        return b;
    }

    private static int[][] moveDown(int[][] a) {
        int[][] b = new int[N][N];
        for (int j = 0; j < N; j++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = N - 1; i >= 0; i--) if (a[i][j] != 0) list.add(a[i][j]);
            ArrayList<Integer> merged = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (i + 1 < list.size() && list.get(i).equals(list.get(i + 1))) {
                    merged.add(list.get(i) * 2);
                    i++;
                } else merged.add(list.get(i));
            }
            for (int i = 0; i < merged.size(); i++) b[N - 1 - i][j] = merged.get(i);
        }
        return b;
    }

    private static int[][] moveLeft(int[][] a) {
        int[][] b = new int[N][N];
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < N; j++) if (a[i][j] != 0) list.add(a[i][j]);
            ArrayList<Integer> merged = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                if (j + 1 < list.size() && list.get(j).equals(list.get(j + 1))) {
                    merged.add(list.get(j) * 2);
                    j++;
                } else merged.add(list.get(j));
            }
            for (int j = 0; j < merged.size(); j++) b[i][j] = merged.get(j);
        }
        return b;
    }

    private static int[][] moveRight(int[][] a) {
        int[][] b = new int[N][N];
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = N - 1; j >= 0; j--) if (a[i][j] != 0) list.add(a[i][j]);
            ArrayList<Integer> merged = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                if (j + 1 < list.size() && list.get(j).equals(list.get(j + 1))) {
                    merged.add(list.get(j) * 2);
                    j++;
                } else merged.add(list.get(j));
            }
            for (int j = 0; j < merged.size(); j++) b[i][N - 1 - j] = merged.get(j);
        }
        return b;
    }
}