import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 작은 숫자들
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());

            if (maxHeap.size() == minHeap.size()) {
                maxHeap.offer(number);
            } else {
                minHeap.offer(number);
            }

            if (!minHeap.isEmpty() && !maxHeap.isEmpty()) {
                if (minHeap.peek() < maxHeap.peek()) {
                    int temp = minHeap.poll();
                    minHeap.offer(maxHeap.poll());
                    maxHeap.offer(temp);
                }
            }

            answer.append(maxHeap.peek()).append('\n');
        }

        System.out.print(answer);
    }
}
