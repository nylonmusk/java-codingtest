import java.io.*;
import java.util.*;

public class Main {
    static char[] operators = {'+', '-', '*', '/'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int minValue = Integer.MAX_VALUE;

        for (char op1 : operators) {
            for (char op2 : operators) {
                Integer result = calculate(a, b, c, op1, op2);
                if (result != null && result >= 0) {
                    minValue = Math.min(minValue, result);
                }
            }
        }

        System.out.println(minValue);
    }

    static Integer calculate(int a, int b, int c, char op1, char op2) {
        int first = applyOperation(a, b, op1);
        if (first == Integer.MIN_VALUE) return null;

        int second = applyOperation(first, c, op2);
        if (second == Integer.MIN_VALUE) return null;

        return second;
    }

    static int applyOperation(int x, int y, char op) {
        switch (op) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return (y != 0 && x % y == 0) ? x / y : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }
}