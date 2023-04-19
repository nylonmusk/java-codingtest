import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet set = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        if(set.size() >= nums.length / 2) {
            answer = nums.length / 2;
        }
        
        if(set.size() < nums.length / 2) {
            answer = set.size();
        }
        
        return answer;
    }
}