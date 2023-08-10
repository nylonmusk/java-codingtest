import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
        
        for (String s : operations) {
            if (s.equals("D -1")) {
                if (!maxHeap.isEmpty()) {
                    maxHeap.remove(minHeap.poll());
                }
            } else if (s.equals("D 1")) {
                if (!minHeap.isEmpty()) {
                    minHeap.remove(maxHeap.poll());    
                }
            } else {
                int num = Integer.parseInt(s.split(" ")[1]);
                maxHeap.offer(num);
                minHeap.offer(num);
            }
        }
        if (maxHeap.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{maxHeap.poll(), minHeap.poll()};
        }
    }
}