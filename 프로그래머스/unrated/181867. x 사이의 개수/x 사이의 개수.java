import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        for (String s : myString.split("x")) {
            answer.add(s.length());
        }
        if (myString.charAt(myString.length() - 1) == 'x') {
            answer.add(0);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}