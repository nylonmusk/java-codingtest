import java.util.Arrays;
import java.util.Comparator;


class Solution {
    public String solution(int[] numbers) {
        String[] stringNum = new String[numbers.length];
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < numbers.length; i++) {
            stringNum[i] = Integer.toString(numbers[i]);    
        }
        
        Arrays.sort(stringNum, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return ((o2 + o1).compareTo(o1 + o2));
			}
		});
        
        if (stringNum[0].equals("0")) return "0";
        
        for (String num : stringNum) {
            answer.append(num);
        }
        return answer.toString();
    }
}