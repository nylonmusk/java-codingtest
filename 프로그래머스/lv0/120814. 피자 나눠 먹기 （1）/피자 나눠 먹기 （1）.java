class Solution {
    public int solution(int n) {
        int answer = 7;
        while(answer / n < 1) {
            answer += 7; 
        }
        return answer/7;
    }
}