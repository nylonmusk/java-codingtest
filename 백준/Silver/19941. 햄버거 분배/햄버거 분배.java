import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int K;
    private static char[] arr;
    private static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = br.readLine().toCharArray();
        isVisited = new boolean[N];

        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 'P') {
                answer += getHamburger(i);
            }
        }
        System.out.println(answer);
    }

    private static int getHamburger(int i) {
        for (int j = Math.max(0, i - K); j <= Math.min(N - 1, i + K); j++) {
            if (arr[j] == 'H' && !isVisited[j]) {
                isVisited[j] = true;
                return 1;
            }
        }
        return 0;
    }
}
