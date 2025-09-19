import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine().trim();
            s = s.replace(".", "");
            a[i] = Integer.parseInt(s);
        }

        int answer = -1;
        outer:
        for (int m = 1; m <= 1000; m++) {
            for (int i = 0; i < N; i++) {
                long ai = a[i];
                long lower = (ai * m + 999) / 1000;
                long upper = ((ai + 1L) * m - 1) / 1000;
                if (lower > upper) {
                    continue outer;
                }
            }
            answer = m;
            break;
        }

        if (answer == -1) {
            answer = 1000;
        }
        System.out.println(answer);
    }
}