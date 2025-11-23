import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N + 1];
            boolean[] visited = new boolean[N + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int cycleCount = 0;

            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    cycleCount++;
                    int cur = i;

                    while (!visited[cur]) {
                        visited[cur] = true;
                        cur = arr[cur];
                    }
                }
            }

            sb.append(cycleCount).append("\n");
        }

        System.out.print(sb);
    }
}