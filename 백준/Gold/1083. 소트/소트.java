import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int S = Integer.parseInt(br.readLine());

        for (int i = 0; i < N && S > 0; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < N && j <= i + S; j++) {
                if (A[j] > A[maxIndex]) {
                    maxIndex = j;
                }
            }
            for (int j = maxIndex; j > i; j--) {
                int temp = A[j];
                A[j] = A[j - 1];
                A[j - 1] = temp;
            }
            S -= (maxIndex - i);
        }

        StringBuilder answer = new StringBuilder();
        for (int value : A) {
            answer.append(value).append(" ");
        }
        System.out.println(answer);
    }
}
