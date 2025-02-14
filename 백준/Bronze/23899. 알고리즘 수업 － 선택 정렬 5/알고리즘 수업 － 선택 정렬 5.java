import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        if (Arrays.equals(A, B)) {
            System.out.println(1);
            return;
        }

        for (int last = N - 1; last > 0; last--) {
            int maxIdx = 0;
            for (int i = 1; i <= last; i++) {
                if (A[i] > A[maxIdx]) {
                    maxIdx = i;
                }
            }

            if (maxIdx != last) {
                int temp = A[last];
                A[last] = A[maxIdx];
                A[maxIdx] = temp;
            }

            if (Arrays.equals(A, B)) {
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);
    }
}