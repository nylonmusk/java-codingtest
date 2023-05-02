import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(br.readLine());
        String X = br.readLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < sb.length(); i++) {
            stack.push(sb.charAt(i));
            if (stack.size() >= X.length() && isEqual(stack, X)) {
                for (int j = 0; j < X.length(); j++) {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            bw.write("FRULA");
        } else {
            StringBuilder result = new StringBuilder();
            for (char c : stack) {
                result.append(c);
            }
            bw.write(result.toString());
        }
        bw.flush();
        bw.close();
    }
    public static boolean isEqual(Stack<Character> stack, String X) {
        for (int i = 0; i < X.length(); i++) {
            if (stack.get(stack.size() - X.length() + i) != X.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}