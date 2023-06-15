import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(bfs(A, B));
    }

    private static long bfs(int A, int B) {
        Queue<long[]> queue = new LinkedList<>();
        queue.offer(new long[]{A, 1});
        while (!queue.isEmpty()) {
            long[] temp = queue.poll();
            long value = temp[0];
            long count = temp[1];
            if (value == B) {
                return count;
            }
            if (value * 2 <= B) {
                queue.offer(new long[]{value * 2, count + 1});
            }
            if (Long.parseLong(String.valueOf(value) + "1") <= B) {
                queue.offer(new long[]{Long.parseLong(String.valueOf(value) + "1"), count + 1});
            }
        }
        return -1;
    }
}
