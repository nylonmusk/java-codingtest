import java.io.*;
import java.util.*;

public class Main {
    private static long[] tree, lazy;
    private static int N;

    private static void update(int node, int start, int end, int l, int r, long diff) {
        if (lazy[node] != 0) {
            tree[node] += (end - start + 1) * lazy[node];
            if (start != end) {
                lazy[node * 2] += lazy[node];
                lazy[node * 2 + 1] += lazy[node];
            }
            lazy[node] = 0;
        }

        if (r < start || end < l) return;

        if (l <= start && end <= r) {
            tree[node] += (end - start + 1) * diff;
            if (start != end) {
                lazy[node * 2] += diff;
                lazy[node * 2 + 1] += diff;
            }
            return;
        }

        int mid = (start + end) / 2;
        update(node * 2, start, mid, l, r, diff);
        update(node * 2 + 1, mid + 1, end, l, r, diff);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    private static long query(int node, int start, int end, int l, int r) {
        if (lazy[node] != 0) {
            tree[node] += (end - start + 1) * lazy[node];
            if (start != end) {
                lazy[node * 2] += lazy[node];
                lazy[node * 2 + 1] += lazy[node];
            }
            lazy[node] = 0;
        }

        if (r < start || end < l) return 0;

        if (l <= start && end <= r) return tree[node];

        int mid = (start + end) / 2;
        return query(node * 2, start, mid, l, r)
                + query(node * 2 + 1, mid + 1, end, l, r);
    }

    private static void build(int node, int start, int end, long[] arr) {
        if (start == end) {
            tree[node] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        build(node * 2, start, mid, arr);
        build(node * 2 + 1, mid + 1, end, arr);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[] arr = new long[N + 1];
        for (int i = 1; i <= N; i++) arr[i] = Long.parseLong(br.readLine());

        tree = new long[4 * N];
        lazy = new long[4 * N];
        build(1, 1, N, arr);

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < M + K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 1) {
                long d = Long.parseLong(st.nextToken());
                update(1, 1, N, b, c, d);
            } else {
                answer.append(query(1, 1, N, b, c)).append('\n');
            }
        }

        System.out.print(answer);
    }
}