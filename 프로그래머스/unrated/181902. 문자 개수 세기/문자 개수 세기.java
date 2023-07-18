class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            if (65 <= my_string.charAt(i) && my_string.charAt(i) <= 90) {
                answer[my_string.charAt(i) - 'A'] = answer[my_string.charAt(i) - 'A'] + 1;
            } else {
                answer[my_string.charAt(i) - 'a' + 26] = answer[my_string.charAt(i) - 'a' + 26] + 1;
            }
        }
        return answer;
    }
}