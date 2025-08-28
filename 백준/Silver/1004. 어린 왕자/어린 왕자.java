import java.io.*;
import java.util.*;

public class Main {
    static boolean inside(long x, long y, long cx, long cy, long r) {
        long dx = x - cx;
        long dy = y - cy;
        long rr = r * r;
        return dx * dx + dy * dy < rr;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x1 = Long.parseLong(st.nextToken());
            long y1 = Long.parseLong(st.nextToken());
            long x2 = Long.parseLong(st.nextToken());
            long y2 = Long.parseLong(st.nextToken());

            int n = Integer.parseInt(br.readLine().trim());
            int count = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                long cx = Long.parseLong(st.nextToken());
                long cy = Long.parseLong(st.nextToken());
                long r  = Long.parseLong(st.nextToken());

                boolean sIn = inside(x1, y1, cx, cy, r);
                boolean eIn = inside(x2, y2, cx, cy, r);

                if (sIn ^ eIn) count++;
            }
            answer.append(count).append('\n');
        }
        System.out.print(answer);
    }
}