import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        
        List<Integer> sumList = new ArrayList<Integer>();
        
        for (int i=0; i<numbers.length; i++) {
            for(int j= i+1; j<numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                
                if(!sumList.contains(sum)){
                    sumList.add(sum);
                }
            }
        }
        
        answer = sumList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}