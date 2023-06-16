import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Main {
    static class DSLR {
        int value;
        String command;

        public DSLR(int value, String command) {
            this.value = value;
            this.command = command;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(bfs(A, B));
        }
    }

    private static String bfs(int A, int B) {
        boolean[] visited = new boolean[10000];
        visited[A] = true;

        Queue<DSLR> queue = new LinkedList<>();
        queue.offer(new DSLR(A, ""));

        while (!queue.isEmpty()) {
            int value = queue.peek().value;
            String command = queue.peek().command;
            queue.poll();
            if (value == B) {
                return command;
            }

            // D
            int D = (value * 2) % 10000;
            if (!visited[D]) {
                visited[D] = true;
                queue.offer(new DSLR(D, command + "D"));
            }

            // S
            int S = (value - 1 + 10000) % 10000;
            if (!visited[S]) {
                visited[S] = true;
                queue.offer(new DSLR(S, command + "S"));
            }

            // L
            int L = (value % 1000) * 10 + (value / 1000);
            if (!visited[L]) {
                visited[L] = true;
                queue.offer(new DSLR(L, command + "L"));
            }

            // R
            int R = (value % 10) * 1000 + (value / 10);
            if (!visited[R]) {
                visited[R] = true;
                queue.offer(new DSLR(R, command + "R"));
            }
        }
        return "잘풀었는데 왜 자꾸 틀리는거임 개빡치게";
    }
}
