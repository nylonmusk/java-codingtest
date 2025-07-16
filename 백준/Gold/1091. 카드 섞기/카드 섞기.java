import java.io.*;
import java.util.*;

public class Main {
    private static int N;
    private static int[] P, S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        P = new int[N];
        S = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }

        int[] current = new int[N];
        for (int i = 0; i < N; i++) {
            current[i] = i;
        }

        int count = 0;

        while (true) {
            if (isCorrect(current)) {
                System.out.println(count);
                return;
            }

            current = shuffle(current);

            count++;

            if (count > 1000000) {
                System.out.println(-1);
                return;
            }
        }
    }

    private static boolean isCorrect(int[] current) {
        for (int i = 0; i < N; i++) {
            if (P[current[i]] != i % 3) return false;
        }
        return true;
    }

    private static int[] shuffle(int[] current) {
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[S[i]] = current[i];
        }
        return result;
    }
}