class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        int i = my_string.length();
        int j = my_string.length() - 1;
        while(j >= 0) {
            answer.append(my_string.substring(j,i));
            j--;
            i--;
        }
        
        return answer.toString();
    }
}