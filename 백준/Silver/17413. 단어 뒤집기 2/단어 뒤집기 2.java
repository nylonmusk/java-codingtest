import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] words = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        String answer = "";
        for (char c : words) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            StringBuilder temp = new StringBuilder();
            if (stack.peek() == '>') {
                while (stack.peek() != '<') {
                    temp.append(stack.pop());
                }
                temp.append(stack.pop());
                answer = (temp.reverse()) + answer;
            } else if (Character.isAlphabetic(stack.peek()) || Character.isDigit(stack.peek())){
                while (!stack.isEmpty() && (Character.isAlphabetic(stack.peek()) || Character.isDigit(stack.peek()))) {
                    temp.append(stack.pop());
                }
                answer = temp + answer;
            } else {
                answer = stack.pop() + answer;
            }
        }
        System.out.println(answer);
    }
}

