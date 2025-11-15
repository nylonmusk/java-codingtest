import java.io.*;
import java.util.*;

public class Main {
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) {
            in = is;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= 32) if (c == -1) return -1;
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = 0;
            while (c > 32) {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        int n = fs.nextInt();
        int[] inorder = new int[n];
        for (int i = 0; i < n; i++) {
            inorder[i] = fs.nextInt();
        }
        int[] post = new int[n];
        for (int i = 0; i < n; i++) {
            post[i] = fs.nextInt();
        }
        int[] idx = new int[n + 1];
        for (int i = 0; i < n; i++) {
            idx[inorder[i]] = i;
        }
        StringBuilder answer = new StringBuilder();
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{0, n - 1, 0, n - 1});
        while (!stack.isEmpty()) {
            int[] s = stack.pop();
            int l1 = s[0], r1 = s[1], l2 = s[2], r2 = s[3];
            if (l1 > r1 || l2 > r2) continue;
            int root = post[r2];
            answer.append(root).append(' ');
            int rootPos = idx[root];
            int leftSize = rootPos - l1;
            int rightSize = r1 - rootPos;
            if (rightSize > 0) stack.push(new int[]{rootPos + 1, r1, l2 + leftSize, r2 - 1});
            if (leftSize > 0) stack.push(new int[]{l1, rootPos - 1, l2, l2 + leftSize - 1});
        }
        if (answer.length() > 0) answer.setLength(answer.length() - 1);
        System.out.println(answer);
    }
}