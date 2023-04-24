import java.util.List;
import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList();
        int value = Integer.MAX_VALUE;
        
        for (int i : arr) {
            if (value != i) {
                list.add(i);
                value = i;
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}