import java.util.*;

class Solution {
    List<String> numberList = new ArrayList<>();
    public int solution(String numbers) {
        int answer = 0;
        makeNumber(numbers, "", new boolean[numbers.length()]);
        
        for (String num : numberList) {
            int number = Integer.parseInt(num);
            answer += checkNumber(number);
        }
        return answer;
    }
    
    void makeNumber(String numbers, String s, boolean[] used) {
        if (!s.isEmpty() && !numberList.contains(s) && !s.startsWith("0")) {
            numberList.add(s);
        }
        for (int i = 0; i < numbers.length(); i++) {
            if (!used[i]) {
                used[i] = true;
                makeNumber(numbers, s + numbers.charAt(i), used);
                used[i] = false;
            }
        }
    }
    
    int checkNumber(int number) {
        if (number == 1) return 0;
        boolean isValid = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isValid = false;
                break;
            }
        }
        return isValid ? 1 : 0;
    }
}

