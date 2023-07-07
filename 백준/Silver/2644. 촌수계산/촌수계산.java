import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static boolean[] visited;
    static boolean[][] relative;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        m = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];
        
        relative = new boolean[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int tempA = Integer.parseInt(st.nextToken());
            int tempB = Integer.parseInt(st.nextToken());
            relative[tempA][tempB] = relative[tempB][tempA] = true;
        }
        
        System.out.println(dfs(a, b));
    }

    private static int dfs(int a, int b) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{a, 0});
        visited[a] = true;

        while (!stack.isEmpty()) {
            int[] temp = stack.pop();
            int current = temp[0];
            int count = temp[1];

            if (current == b) {
                return count;
            }

            for (int i = 1; i <= n; i++) {
                if (relative[current][i] && !visited[i]) {
                    visited[i] = true;
                    stack.push(new int[]{i, count + 1});
                }
            }
        }

        return -1;
    }
}