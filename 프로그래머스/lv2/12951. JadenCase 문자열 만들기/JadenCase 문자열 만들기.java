class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.toLowerCase().split("");
        boolean flag = true;
        
        for(String ss : str){
            answer += flag? ss.toUpperCase() : ss;
            flag = ss.equals(" ")? true : false;
        }
        
        return answer;
    }
}