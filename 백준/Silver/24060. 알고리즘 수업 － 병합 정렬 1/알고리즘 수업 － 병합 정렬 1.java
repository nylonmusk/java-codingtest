import java.io.*;
import java.util.*;

public class Main {
    private static int[] A, tmp;
    private static long K, count = 0;
    private static int answer = -1;

    private static void mergeSort(int p, int r) {
        if (p < r && count < K) {
            int q = (p + r) / 2;
            mergeSort(p, q);
            mergeSort(q + 1, r);
            merge(p, q, r);
        }
    }

    private static void merge(int p, int q, int r) {
        int i = p, j = q + 1, t = 0;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) tmp[t++] = A[i++];
            else tmp[t++] = A[j++];
        }
        while (i <= q) tmp[t++] = A[i++];
        while (j <= r) tmp[t++] = A[j++];

        i = p;
        t = 0;
        while (i <= r) {
            count++;
            if (count == K) {
                answer = tmp[t];
                return;
            }
            A[i++] = tmp[t++];
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Long.parseLong(st.nextToken());

        A = new int[N];
        tmp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        mergeSort(0, N - 1);
        System.out.print(answer);
    }
}