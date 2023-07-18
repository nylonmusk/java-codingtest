class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int num : num_list) {
            if (num % 2 == 0) {
                even.append(num);
            } else {
                odd.append(num);
            }
        }
        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }
}