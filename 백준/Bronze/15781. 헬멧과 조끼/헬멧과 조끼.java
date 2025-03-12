import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int maxN = 0;
        int maxM = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            maxN = Math.max(maxN, Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            maxM = Math.max(maxM, Integer.parseInt(st.nextToken()));
        }

        System.out.println(maxN + maxM);
    }
}