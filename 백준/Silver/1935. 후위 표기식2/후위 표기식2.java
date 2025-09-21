import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String expr = br.readLine();

        double[] values = new double[26];
        for (int i = 0; i < N; i++) {
            values[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        for (char c : expr.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                stack.push(values[c - 'A']);
            } else {
                double b = stack.pop();
                double a = stack.pop();
                double res = 0;

                if (c == '+') {
                    res = a + b;
                } else if (c == '-') {
                    res = a - b;
                } else if (c == '*') {
                    res = a * b;
                } else if (c == '/') {
                    res = a / b;
                }

                stack.push(res);
            }
        }

        System.out.printf("%.2f\n", stack.pop());
    }
}