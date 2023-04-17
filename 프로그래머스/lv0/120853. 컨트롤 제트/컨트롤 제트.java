class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            answer += !str[i].equals("Z") ? Integer.parseInt(str[i]) : - Integer.parseInt(str[i-1]);  
        }
        return answer;
    }
}