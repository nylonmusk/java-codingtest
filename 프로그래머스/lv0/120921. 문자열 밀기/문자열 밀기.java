class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        int length = A.length();
        for (int i = 0; i < length; i++) {
            if (sb.toString().equals(B)) {
                return answer;
            }
            sb.insert(0, sb.charAt(length - 1));
            sb.deleteCharAt(length);
            answer++;
        }    
        return -1;
    }
}