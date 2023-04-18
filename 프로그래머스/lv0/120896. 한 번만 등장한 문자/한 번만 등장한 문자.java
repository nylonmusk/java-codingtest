import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        
        for (String ss : s.split("")) {
            map.put(ss, map.getOrDefault(ss, 0) + 1);
        }
        
        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        
        for (String key : keyList) {
            if (map.get(key) == 1) {
                answer.append(key);
            }
        }
        
        return answer.toString();
    }
}