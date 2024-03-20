import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        if (A.length == 2 && A[0] != A[1]) {
            System.out.println(2);
            return;
        }

        int[] dpLeft = new int[N];
        int[] dpRight = new int[N];

        dpLeft[0] = 1;
        dpRight[0] = 1;

        for (int i = 0; i < N; i++) {
            dpLeft[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    dpLeft[i] = Math.max(dpLeft[j] + 1, dpLeft[i]);
                }
            }
        }

        for (int i = N - 1; i >= 0; i--) {
            dpRight[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if (A[i] > A[j]) {
                    dpRight[i] = Math.max(dpRight[j] + 1, dpRight[i]);
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer = Math.max(answer, dpLeft[i] + dpRight[i]);
        }

        System.out.println(answer - 1);
    }
}
