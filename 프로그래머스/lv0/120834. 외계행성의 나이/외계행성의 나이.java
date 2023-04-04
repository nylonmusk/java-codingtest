class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        int length = (int)(Math.log10(age) + 1);
        for(int i = 0; i < length; i++) {
            char t = (char)(age % 10 + 97);
            answer.append(t);
            age /= 10;
        }
        return answer.reverse().toString();
    }
}