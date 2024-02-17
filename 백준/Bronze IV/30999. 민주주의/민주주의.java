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

        int count = 0;

        for (int i = 0; i < N; i++) {
            String opinions = br.readLine();
            int approvals = 0;

            for (int j = 0; j < M; j++) {
                if (opinions.charAt(j) == 'O') {
                    approvals++;
                }
            }

            if (approvals > M / 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
