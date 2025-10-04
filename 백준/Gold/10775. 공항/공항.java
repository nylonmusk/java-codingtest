import java.io.*;

public class Main {
    private static int[] parent;

    private static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        parent[a] = b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int G = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        parent = new int[G + 1];
        for (int i = 0; i <= G; i++) {
            parent[i] = i;
        }

        int result = 0;
        for (int i = 0; i < P; i++) {
            int gi = Integer.parseInt(br.readLine());
            int root = find(gi);

            if (root == 0) break;
            result++;

            union(root, root - 1);
        }

        System.out.println(result);
    }
}