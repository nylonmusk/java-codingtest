import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Long.parseLong(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (x == 0) {
            System.out.println("0");
            return;
        }

        StringBuilder sb = new StringBuilder();

        if (b > 0) {
            boolean neg = (x < 0);
            x = Math.abs(x);
            while (x > 0) {
                sb.append(x % b);
                x /= b;
            }
            if (neg) {
                sb.append("-");
            }
            System.out.println(sb.reverse().toString());
        } else {
            int base = -b;
            while (x != 0) {
                long r = x % base;
                if (r < 0) {
                    r += base;
                }
                sb.append(r);
                x = (x - r) / b;
            }
            System.out.println(sb.reverse().toString());
        }
    }
}