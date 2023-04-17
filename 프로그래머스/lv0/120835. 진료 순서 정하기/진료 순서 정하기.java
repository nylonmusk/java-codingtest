import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] emergency2 = Arrays.copyOf(emergency, emergency.length);
        
        Arrays.sort(emergency);
        
        int k = emergency.length;
        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], k);
            k--;
        }
        
        for (int i = 0; i < emergency2.length; i++) {
            answer[i] = map.get(emergency2[i]);
        }
        return answer;
    }
}