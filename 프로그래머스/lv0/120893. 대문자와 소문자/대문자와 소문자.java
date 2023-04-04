class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        for(int i = 0; i < my_string.length(); i++) {
            String temp = "";
            if(65 <= my_string.charAt(i) && my_string.charAt(i) <= 90) {
                answer.append((char)(my_string.charAt(i) + 32));
            }else if(97 <= my_string.charAt(i) && my_string.charAt(i) <= 122) {
                answer.append((char)(my_string.charAt(i) - (char)32));
            }
        }
        return answer.toString();
    }
}