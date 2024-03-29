import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();

        int multiply = 1;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char c  = s.charAt(i);
            if (c == '(') {
                stack.push(c);
                multiply *= 2;
            }
            else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    answer = 0;
                    break;
                } else if (s.charAt(i - 1) == '(') {
                    answer += multiply;
                }
                stack.pop();
                multiply /= 2;
            }
            else if (c == '[') {
                stack.push(c);
                multiply *= 3;
            }
            else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    answer = 0;
                    break;
                } else if (s.charAt(i - 1) == '[') {
                    answer += multiply;
                }
                stack.pop();
                multiply /= 3;
            }
        }
        System.out.println(stack.isEmpty() ? answer : 0);
    }
}
