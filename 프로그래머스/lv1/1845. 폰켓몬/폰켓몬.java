import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int getMon = nums.length / 2;   
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() < getMon) {
            return set.size();
        }
            return getMon;
    }
}