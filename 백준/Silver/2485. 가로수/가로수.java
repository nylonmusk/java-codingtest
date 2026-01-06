import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = Integer.parseInt(br.readLine());

        int g = a[1] - a[0];
        for (int i = 2; i < N; i++) {
            g = gcd(g, a[i] - a[i - 1]);
        }

        int cnt = 0;
        for (int i = 1; i < N; i++) {
            cnt += (a[i] - a[i - 1]) / g - 1;
        }

        System.out.println(cnt);
    }

    private static int gcd(int x, int y) {
        while (y != 0) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;
    }
}