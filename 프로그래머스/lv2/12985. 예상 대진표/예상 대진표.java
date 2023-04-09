class Solution{
    public int solution(int n, int a, int b){
        int answer = 0;
        int maxBetweenAB = Math.max(a,b);
        int minBetweenAB = Math.min(a,b);
        while(true){
            maxBetweenAB = (maxBetweenAB / 2) + (maxBetweenAB % 2);
            minBetweenAB = (minBetweenAB / 2) + (minBetweenAB % 2);
            answer++;
            if(maxBetweenAB==minBetweenAB){
                break;
            }
        }
        return answer;
    }
}