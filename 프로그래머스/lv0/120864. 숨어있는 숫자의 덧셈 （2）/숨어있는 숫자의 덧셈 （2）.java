class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = "[a-zA-Z]";
        String[] st = my_string.split(str);
        for (int i = 0; i < st.length; i++) {
			answer+= !st[i].isEmpty() ? Integer.parseInt(st[i]) : 0;
		}
        return answer;
    }
}