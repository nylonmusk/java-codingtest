class Solution {
    public int solution(int n) {
        int pizzaPieces = 6;
        int answer = 1;
        while(pizzaPieces % n != 0) {
            answer++;
            pizzaPieces += 6;
        }
        return answer;
    }
}