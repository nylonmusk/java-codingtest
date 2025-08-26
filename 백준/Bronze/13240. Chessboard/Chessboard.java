import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringBuilder row = new StringBuilder(M);
            for (int j = 0; j < M; j++) {
                if (((i + j) & 1) == 0) row.append('*');
                else row.append('.');
            }
            answer.append(row).append('\n');
        }

        System.out.print(answer);
    }
}