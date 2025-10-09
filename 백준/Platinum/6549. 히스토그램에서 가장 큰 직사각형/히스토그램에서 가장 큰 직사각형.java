import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;

            long[] heights = new long[n];
            for (int i = 0; i < n; i++) {
                heights[i] = Long.parseLong(st.nextToken());
            }

            answer.append(getMaxArea(heights)).append('\n');
        }

        System.out.print(answer);
    }

    private static long getMaxArea(long[] heights) {
        Stack<Integer> stack = new Stack<>();
        long maxArea = 0;
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                long height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            long height = heights[stack.pop()];
            int width = stack.isEmpty() ? n : (n - stack.peek() - 1);
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}