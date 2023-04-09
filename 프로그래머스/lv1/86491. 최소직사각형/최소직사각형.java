class Solution {
    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < sizes.length; i++){
            x = Math.max(x, Math.max(sizes[i][0], sizes[i][1]));   
            y = Math.max(y, Math.min(sizes[i][0], sizes[i][1]));   
        }
        return x * y;
    }
}