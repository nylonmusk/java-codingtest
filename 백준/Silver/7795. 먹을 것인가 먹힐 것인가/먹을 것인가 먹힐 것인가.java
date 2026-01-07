import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] A = new int[N];
            int[] B = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) B[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(A);
            Arrays.sort(B);

            long cnt = 0;
            int j = 0;
            for (int i = 0; i < N; i++) {
                while (j < M && B[j] < A[i]) j++;
                cnt += j;
            }

            answer.append(cnt).append('\n');
        }

        System.out.print(answer);
    }
}