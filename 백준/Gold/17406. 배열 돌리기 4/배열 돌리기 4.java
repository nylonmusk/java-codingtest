import java.io.*;
import java.util.*;

public class Main {

    private static int N, M, K;
    private static int[][] A;
    private static int[][] ops;
    private static boolean[] used;
    private static int[] order;
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ops = new int[K][3];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            ops[i][0] = Integer.parseInt(st.nextToken());
            ops[i][1] = Integer.parseInt(st.nextToken());
            ops[i][2] = Integer.parseInt(st.nextToken());
        }

        used = new boolean[K];
        order = new int[K];

        permutation(0);

        System.out.println(answer);
    }

    private static void permutation(int depth) {
        if (depth == K) {
            int[][] copy = copyArray(A);

            for (int i = 0; i < K; i++) {
                int idx = order[i];
                rotate(copy, ops[idx][0], ops[idx][1], ops[idx][2]);
            }

            answer = Math.min(answer, getValue(copy));
            return;
        }

        for (int i = 0; i < K; i++) {
            if (!used[i]) {
                used[i] = true;
                order[depth] = i;
                permutation(depth + 1);
                used[i] = false;
            }
        }
    }

    private static int getValue(int[][] arr) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) sum += arr[i][j];
            minimum = Math.min(minimum, sum);
        }
        return minimum;
    }

    private static int[][] copyArray(int[][] src) {
        int[][] dest = new int[N][M];
        for (int i = 0; i < N; i++)
            dest[i] = src[i].clone();
        return dest;
    }

    private static void rotate(int[][] arr, int r, int c, int s) {
        r--;
        c--;

        for (int l = 1; l <= s; l++) {
            int top = r - l;
            int left = c - l;
            int bottom = r + l;
            int right = c + l;

            int temp = arr[top][left];

            for (int i = top; i < bottom; i++) {
                arr[i][left] = arr[i + 1][left];
            }
            for (int i = left; i < right; i++) {
                arr[bottom][i] = arr[bottom][i + 1];
            }
            for (int i = bottom; i > top; i--) {
                arr[i][right] = arr[i - 1][right];
            }
            for (int i = right; i > left + 1; i--) {
                arr[top][i] = arr[top][i - 1];
            }

            arr[top][left + 1] = temp;
        }
    }
}