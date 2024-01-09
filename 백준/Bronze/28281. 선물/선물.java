import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int answer = Integer.MAX_VALUE;
        int[] socks = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            socks[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N - 1; i++) {
            answer = Math.min(answer, socks[i] * X + socks[i + 1] * X);
        }

        System.out.println(answer);
    }
}
