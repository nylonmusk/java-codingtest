class Solution {
    public int solution(int[][] dots) {
        if(getInclination(dots[0], dots[1]) == getInclination(dots[3], dots[2])
           || getInclination(dots[0], dots[3]) == getInclination(dots[1], dots[2])
           || getInclination(dots[0], dots[2]) == getInclination(dots[1], dots[3])) {
            return 1;
        }
        return 0;
    }
    
    public double getInclination(int[] dot1, int[] dot2){
        return (double)(dot1[1] - dot2[1]) / (dot1[0] - dot2[0]);
    }
}