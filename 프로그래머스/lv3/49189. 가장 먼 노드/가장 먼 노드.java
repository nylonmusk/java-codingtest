import java.util.*;

class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int solution(int n, int[][] edge) {
        return bfs(n, edge);
    }
    
    int bfs(int n, int[][] edge) {
        int max = Integer.MIN_VALUE;
        boolean[] visited = new boolean[n + 1];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{1, 0});
        visited[1] = true;
        
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int now = temp[0];
            int count = temp[1];
            
            max = Math.max(max, count);
            map.put(count, map.getOrDefault(count, 0) + 1);
            
            for (int i = 0; i < edge.length; i++) {
                if (now == edge[i][0] && !visited[edge[i][1]]) {
                    queue.offer(new int[]{edge[i][1], count + 1});
                    visited[edge[i][1]] = true;
                } else if (now == edge[i][1] && !visited[edge[i][0]]) {
                    queue.offer(new int[]{edge[i][0], count + 1});
                    visited[edge[i][0]] = true;
                }
            }
        }
        return map.get(max);
    }
}
