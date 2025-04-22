import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] B = new int[N];
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = (int)((long)B[i] * (i + 1) - sum);
            sum += A[i];
        }

        StringBuilder answer = new StringBuilder();
        for (int a : A) {
            answer.append(a).append(" ");
        }
        System.out.println(answer.toString().trim());
    }
}