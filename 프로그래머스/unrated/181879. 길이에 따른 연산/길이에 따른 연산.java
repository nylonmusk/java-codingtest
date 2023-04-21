class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        boolean b = true;
        for (int n : num_list) {
            if (num_list.length >= 11) answer += n;
            if (num_list.length < 11) {
                answer *= n; 
                b = false;
            }
        }      
        if (b == true) return answer - 1;
        return answer;
    }
}