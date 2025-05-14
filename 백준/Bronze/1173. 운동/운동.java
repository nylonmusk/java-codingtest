import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        if (m + T > M) {
            System.out.println(-1);
            return;
        }

        int nowPulse = m;
        int time = 0;
        int exercise = 0;

        while (exercise < N) {
            if (nowPulse + T <= M) {
                nowPulse += T;
                exercise++;
            } else {
                nowPulse -= R;
                if (nowPulse < m) nowPulse = m;
            }
            time++;
        }

        System.out.println(time);
    }
}