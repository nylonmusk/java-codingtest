class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}