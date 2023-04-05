class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
			if(my_string.indexOf(my_string.charAt(i)) == i) answer.append(my_string.charAt(i));
		}
        return answer.toString();
    }
}