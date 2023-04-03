class Solution {
    public int solution(int slice, int n) {
        int answer = slice;
        while((answer / n) < 1)  {
            if(answer / n < 1) answer += slice;
        }
        return answer/slice;
    }
}