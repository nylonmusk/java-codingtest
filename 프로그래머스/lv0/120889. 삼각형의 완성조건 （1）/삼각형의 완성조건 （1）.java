class Solution {
    public int solution(int[] sides) {
        if(sides[0] + sides[1] > sides[2] 
           && sides[1] + sides[2] > sides[0]
           && sides[0] + sides[2] > sides[1]) {
            return 1;
        }
        return 2;
    }
}