import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int[] creamInfo = new int[N * K];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N * K; i++) {
            creamInfo[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            int noCream = 0;
            for (int j = 0; j < K; j++) {
                if (creamInfo[i * K + j] == 0) {
                    noCream++;
                }
            }
            if (noCream < P) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}