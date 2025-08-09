import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[N];
        Arrays.fill(result, -1);

        int[] stack = new int[N];
        int top = -1;

        for (int i = 0; i < N; i++) {
            while (top != -1 && A[stack[top]] < A[i]) {
                result[stack[top--]] = A[i];
            }
            stack[++top] = i;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            answer.append(result[i]);
            if (i < N - 1) answer.append(' ');
        }
        System.out.println(answer);
    }
}