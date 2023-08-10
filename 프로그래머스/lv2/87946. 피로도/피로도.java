class Solution {
    int answer = -1;
    public int solution(int k, int[][] dungeons) {
        coupang(k, 0, dungeons, new boolean[dungeons.length]);
        return answer;
    }
    void coupang(int k, int count, int[][] dungeons, boolean[] visited) {
        answer = Math.max(answer, count);
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                coupang(k - dungeons[i][1], count + 1, dungeons, visited);
                visited[i] = false;
            }
        }
    }
}