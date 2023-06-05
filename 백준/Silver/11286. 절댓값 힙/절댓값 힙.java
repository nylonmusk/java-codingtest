import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> {
            int absDiff = Integer.compare(Math.abs(a), Math.abs(b));
            if (absDiff == 0) {
                return Integer.compare(a, b);
            }
            return absDiff;
        });
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if (x != 0) {
                priorityQueue.add(x);
            } else {
                if (!priorityQueue.isEmpty()) {
                    sb.append(priorityQueue.poll()).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}