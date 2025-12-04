import java.io.*;
import java.util.*;

public class Main {
    private static int N, M;
    private static int[] tree;
    private static boolean[] lazy;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        tree = new int[N * 4 + 5];
        lazy = new boolean[N * 4 + 5];
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int O = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());
            if (O == 0) {
                update(1, 1, N, S, T);
            } else {
                answer.append(query(1, 1, N, S, T)).append('\n');
            }
        }
        System.out.print(answer);
    }

    private static void applyFlip(int node, int l, int r) {
        tree[node] = (r - l + 1) - tree[node];
        lazy[node] = !lazy[node];
    }

    private static void push(int node, int l, int r) {
        if (!lazy[node] || l == r) return;
        int mid = (l + r) >> 1;
        int left = node << 1;
        int right = left | 1;
        applyFlip(left, l, mid);
        applyFlip(right, mid + 1, r);
        lazy[node] = false;
    }

    private static void update(int node, int l, int r, int ql, int qr) {
        if (qr < l || r < ql) return;
        if (ql <= l && r <= qr) {
            applyFlip(node, l, r);
            return;
        }
        push(node, l, r);
        int mid = (l + r) >> 1;
        update(node << 1, l, mid, ql, qr);
        update((node << 1) | 1, mid + 1, r, ql, qr);
        tree[node] = tree[node << 1] + tree[(node << 1) | 1];
    }

    private static int query(int node, int l, int r, int ql, int qr) {
        if (qr < l || r < ql) return 0;
        if (ql <= l && r <= qr) return tree[node];
        push(node, l, r);
        int mid = (l + r) >> 1;
        return query(node << 1, l, mid, ql, qr) + query((node << 1) | 1, mid + 1, r, ql, qr);
    }
}