import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) a[i] = Integer.parseInt(st.nextToken());

        int i = N - 2;
        while (i >= 0 && a[i] >= a[i + 1]) i--;
        if (i < 0) {
            System.out.println(-1);
            return;
        }

        int j = N - 1;
        while (a[i] >= a[j]) j--;

        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;

        int l = i + 1, r = N - 1;
        while (l < r) {
            tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++;
            r--;
        }

        StringBuilder answer = new StringBuilder();
        for (int k = 0; k < N; k++) {
            answer.append(a[k]);
            if (k + 1 < N) answer.append(' ');
        }
        System.out.println(answer);
    }
}