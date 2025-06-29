import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());

        boolean allAvailable = true;

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            boolean available = false;
            for (int j = 0; j < K; j++) {
                int time = Integer.parseInt(st.nextToken());
                if (time == X) {
                    available = true;
                }
            }

            if (!available) {
                allAvailable = false;
                break;
            }
        }

        System.out.println(allAvailable ? "YES" : "NO");
    }
}