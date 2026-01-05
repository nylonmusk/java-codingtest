import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            int b = Integer.parseInt(st.nextToken());
            if (A[i] == 0) dq.addLast(b);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int c = Integer.parseInt(st.nextToken());
            dq.addFirst(c);
            answer.append(dq.removeLast()).append(' ');
        }

        System.out.println(answer);
    }
}