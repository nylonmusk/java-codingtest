import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int M = Integer.parseInt(br.readLine());

        long sum = 0;
        long xor = 0;

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                int x = Integer.parseInt(st.nextToken());
                sum += x;
                xor = xor ^ x;
            } else if (num == 2) {
                int x = Integer.parseInt(st.nextToken());
                sum -= x;
                xor = xor ^ x;
            } else if (num == 3) {
                answer.append(sum).append("\n");
            } else {
                answer.append(xor).append("\n");
            }
        }

        System.out.print(answer);
    }
}
