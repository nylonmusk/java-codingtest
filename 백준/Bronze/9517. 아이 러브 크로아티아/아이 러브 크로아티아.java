import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int time = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            String Z = st.nextToken();

            time += T;
            if (time >= 210) {
                System.out.println(K);
                return;
            }

            if (Z.equals("T")) {
                K = (K % 8) + 1;
            }
        }
    }
}