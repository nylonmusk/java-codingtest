import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Queue<Integer> queue = new LinkedList<>();

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                queue.add(Integer.parseInt(st.nextToken()));
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int current = queue.poll();
                boolean isMax = true;

                for (int num : queue) {
                    if (num > current) {
                        isMax = false;
                        break;
                    }
                }

                if (isMax) {
                    count++;
                    if (M == 0) {
                        break;
                    }
                } else {
                    queue.add(current);
                }

                M--;
                if (M < 0) {
                    M = queue.size() - 1;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb.toString());
    }
}
