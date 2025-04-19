import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> scores = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            scores.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photo.length; i++) {
            int count = 0;
            for (int j = 0; j < photo[i].length; j++) {
                count += scores.getOrDefault(photo[i][j], 0);
            }
            answer[i] = count;
        }
        
        return answer;
    }
}