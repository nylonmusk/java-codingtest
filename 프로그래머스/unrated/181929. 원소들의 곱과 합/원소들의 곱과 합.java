class Solution {
    public int solution(int[] num_list) {
        int plus = 0;
        int multiply = 1;
        for (int num : num_list) {
            plus += num;
            multiply *= num;
        }
        if (multiply < Math.pow(plus, 2)) return 1;
        return 0;
    }
}