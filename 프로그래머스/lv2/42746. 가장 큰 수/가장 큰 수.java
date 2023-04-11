import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] stringNum = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            stringNum[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(stringNum, new Comparator<String>() {
            
            @Override
            public int compare(String a1, String a2) {
                return ((a2 + a1).compareTo(a1 + a2));
            }
            
        });
        
        if (stringNum[0].equals("0")) {
            return "0";
        }
        
        for (String num : stringNum) {
            answer.append(num);
        }
        
        return answer.toString();
    }
}