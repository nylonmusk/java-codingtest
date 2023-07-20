import java.util.Stack;

class Solution {
    public int solution(String my_string, String is_suffix) {
        Stack<Character> stack = new Stack<>();
        int i = is_suffix.length() - 1;
        int j = my_string.length() - 1;
        if (i > j) {
            stack.push('ㅋ');
        } else {
            
            while (i >= 0 && j >= 0) {
                stack.push(is_suffix.charAt(i));
                i--;
                if (stack.peek() == my_string.charAt(j)) {
                    stack.pop();
                    j--;
                } else {
                    break;
                }
            }
        }
        return stack.size() == 0 ? 1 : 0;
    }
}