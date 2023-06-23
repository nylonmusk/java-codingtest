import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, Collections.reverseOrder());
        for (int value : values) {
            k -= value;
            answer++;
            if (k <= 0) {
                break;
            }
        }
        return answer;
    }
}