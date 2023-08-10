import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue <Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for (int i : scoville) {
            pq.offer(i);
        }
        
        int answer = 0;
        while (!pq.isEmpty()) {
            if (pq.peek() >= K || pq.size() < 2) {
                break;
            } else {
                answer++;
                pq.offer(pq.poll() + 2 * pq.poll());
            }
        }
        return pq.peek() < K ? -1 : answer;
    }
}