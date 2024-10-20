import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int answer = m;
        int now = m;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int incoming = Integer.parseInt(st.nextToken());
            int outgoing = Integer.parseInt(st.nextToken());

            now += (incoming - outgoing);

            if (now < 0) {
                System.out.println(0);
                return;
            }

            answer = Math.max(answer, now);
        }

        System.out.println(answer);
    }
}