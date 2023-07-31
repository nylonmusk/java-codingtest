class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int temp = 1;
            while (temp != 0 && i < s.length() - 1) {
                i++;
                if (s.charAt(i) == c) {
                    temp++;
                } else {
                    temp--;
                }
            }
            answer++;
        }
        return answer;
    }
}