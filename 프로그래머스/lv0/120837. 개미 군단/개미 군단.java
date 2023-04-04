class Solution {
    public int solution(int hp) {
        int answer = 0;
        int jang = 5;
        int byung = 3;
        int ill = 1;
        while(hp > 0) {
            if(hp / jang != 0) {
                answer += hp / jang;
                hp %= jang;
            }
            
            if(hp / byung != 0) {
                answer += hp / byung;
                hp %= byung;
            }
            
            if(hp / ill != 0) {
                answer += hp / ill;
                hp %= ill;
            }
        }
        return answer;
    }
}