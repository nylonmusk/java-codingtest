import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            priorityQueue.offer(Integer.parseInt(br.readLine()));
        }

        int answer = 0;
        int sum = 0;
        for (int i = 0; i < N * 2 - 2; i++) {
            int temp = priorityQueue.poll();
            sum += temp;
            answer += temp;

            if (i % 2 != 0) {
                priorityQueue.offer(sum);
                sum = 0;
            }
        }
        System.out.println(answer);
    }
}
