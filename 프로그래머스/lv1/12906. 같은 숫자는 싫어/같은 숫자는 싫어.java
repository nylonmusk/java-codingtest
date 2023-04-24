import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i : arr) {
            if (stack.peek() == i && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(i);
            }
        }
        
        int[] answer = new int[stack.size()];
        // for (int i = 0; i < arr.length; i++) {
        //     answer[i] = stack.get(i);
        // }
        System.out.println(stack.toString());
        
        
        return answer;
    }
}