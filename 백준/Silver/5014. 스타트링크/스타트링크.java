import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int[] isVisited = new int[F + 1];

        bfs(F, S, G, U, D, isVisited);
    }

    private static void bfs(int F, int S, int G, int U, int D, int[] isVisited) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(S);
        isVisited[S] = 1;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            if (now == G) {
                System.out.println(isVisited[now] - 1);
                break;
            }

            if (now + U <= F && isVisited[now + U] == 0) {
                isVisited[now + U] = isVisited[now] + 1;
                queue.add(now + U);
            }

            if (now - D > 0 && isVisited[now - D] == 0) {
                isVisited[now - D] = isVisited[now] + 1;
                queue.add(now - D);
            }
        }

        if (isVisited[G] == 0) {
            System.out.println("use the stairs");
        }
    }
}