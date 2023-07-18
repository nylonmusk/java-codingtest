import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new HashSet<>();
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i]) && idx < k) {
                set.add(arr[i]);
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        for (int i = 0; i < k - set.size(); i++) {
            answer[idx] = -1;
            idx++;
        }
        return answer;
    }
}