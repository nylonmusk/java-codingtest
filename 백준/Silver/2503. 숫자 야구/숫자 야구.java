import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] q = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            q[i][0] = Integer.parseInt(st.nextToken());
            q[i][1] = Integer.parseInt(st.nextToken());
            q[i][2] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = 123; i <= 987; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;

            if (a == 0 || b == 0 || c == 0) continue;
            if (a == b || b == c || a == c) continue;

            boolean ok = true;

            for (int j = 0; j < N; j++) {
                int num = q[j][0];
                int s = q[j][1];
                int ball = q[j][2];

                int x = num / 100;
                int y = (num / 10) % 10;
                int z = num % 10;

                int strike = 0;
                int bcnt = 0;

                if (a == x) strike++;
                if (b == y) strike++;
                if (c == z) strike++;

                if (a == y || a == z) bcnt++;
                if (b == x || b == z) bcnt++;
                if (c == x || c == y) bcnt++;

                if (strike != s || bcnt != ball) {
                    ok = false;
                    break;
                }
            }

            if (ok) count++;
        }

        System.out.println(count);
    }
}