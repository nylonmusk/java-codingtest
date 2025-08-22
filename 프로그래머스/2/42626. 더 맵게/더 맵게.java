import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for (int s : scoville) {
            pq.offer(s);
        }

        return bfs(pq, K);
    }

    private int bfs(PriorityQueue<Integer> pq, int K) {
        int answer = 0;
        while (!pq.isEmpty()) {
            if (pq.peek() >= K || pq.size() < 2) {
                break;
            } else {
                answer++;
                pq.offer(pq.poll() + pq.poll() * 2);
            }
        }

        return pq.peek() >= K ? answer : -1;
    }
}