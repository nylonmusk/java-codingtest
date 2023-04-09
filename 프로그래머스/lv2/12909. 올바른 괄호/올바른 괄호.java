import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(1);
            }else{
                if(stack.isEmpty()==true){
                    answer = false;
                    break;
                }else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            answer = false;
        }
        return answer;
    }
}