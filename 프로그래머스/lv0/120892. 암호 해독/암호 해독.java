class Solution {
    public String solution(String cipher, int code) {
        StringBuffer answer = new StringBuffer();
        for(int i = 1; i <= cipher.length(); i++) {
            if(i % code == 0) answer.append(cipher.charAt(i-1));
        }
        return answer.toString();
    }
}