import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] shirts = new long[6];
        for (int i = 0; i < 6; i++) {
            shirts[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        long T = Long.parseLong(st.nextToken());
        long P = Long.parseLong(st.nextToken());

        long shirtBundles = 0;
        for (int i = 0; i < 6; i++) {
            shirtBundles += (shirts[i] + T - 1) / T;
        }

        long penBundles = N / P;
        long penSingles = N % P;

        System.out.println(shirtBundles);
        System.out.println(penBundles + " " + penSingles);
    }
}