class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuffer answer = new StringBuffer();
        
        for (String s : str_list) {
            if (!s.contains(ex)) {
                answer.append(s);
            }
        }
        return answer.toString();
    }
}