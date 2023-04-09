class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int purchase = 0;
        while(chicken != 0) {
            purchase++;
            chicken--;
            if(purchase % 10 == 0) {
                purchase++;
                answer++;
            }
        }
        return answer;
    }
}