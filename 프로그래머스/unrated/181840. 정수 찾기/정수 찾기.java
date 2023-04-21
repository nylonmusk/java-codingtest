import java.util.Arrays;

class Solution {
    public int solution(int[] num_list, int n) {
        Arrays.sort(num_list);
        if (Arrays.binarySearch(num_list, n) >= 0) return 1;
        return 0;
    }
}