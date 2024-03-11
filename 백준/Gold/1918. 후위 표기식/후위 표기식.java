import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                answer.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    answer.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && getPriority(stack.peek()) >= getPriority(c)) {
                    answer.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }

        System.out.println(answer);
    }

    private static int getPriority(char operator) {
        char[] arithmeticOperators = {'+', '-', '*', '/'};
        int[] priority = {0, 0, 1, 1};
        for (int i = 0; i < 4; i++) {
            if (arithmeticOperators[i] == operator) {
                return priority[i];
            }
        }
        return -1;
    }
}
