import java.io.*;
import java.util.*;

public class Main {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = Integer.parseInt(br.readLine());
        Arrays.sort(a);

        int g = 0;
        for (int i = 1; i < N; i++) {
            g = gcd(g, a[i] - a[0]);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 2; i * i <= g; i++) {
            if (g % i == 0) {
                res.add(i);
                if (i != g / i) res.add(g / i);
            }
        }
        res.add(g);

        Collections.sort(res);
        StringBuilder answer = new StringBuilder();
        for (int x : res) answer.append(x).append(' ');
        System.out.println(answer);
    }
}