import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int n, String control) {
        int answer = n;
        Map<Character, Integer> map = new HashMap<>();
        map.put('w', 1);
        map.put('s', -1);
        map.put('d', 10);
        map.put('a', -10);
        for (char c : control.toCharArray()) {
            answer += map.get(c);
        }
        return answer;
    }
}