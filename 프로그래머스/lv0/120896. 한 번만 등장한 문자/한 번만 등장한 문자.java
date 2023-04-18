import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String str : s.split("")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        
        for (String key : keyList) {
            if (map.get(key) == 1) {
                answer.append(key);
            }
        }
        
    
        return answer.toString();
    }
}