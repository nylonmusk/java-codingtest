import java.io.*;

public class Main {
    private static int N;
    private static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);

        System.out.print(answer.toString());
    }

    private static void dfs(int num, int depth) {
        if (depth == N) {
            answer.append(num).append('\n');
            return;
        }

        for (int i = 1; i <= 9; i += 2) {
            int next = num * 10 + i;
            if (isPrime(next)) {
                dfs(next, depth + 1);
            }
        }
    }

    private static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}