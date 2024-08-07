import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (N-- > 0) {
            int F = Integer.parseInt(st.nextToken());
            T -= F;
        }

        if (T <= 0) {
            System.out.println("Padaeng_i Happy");
        } else {
            System.out.println("Padaeng_i Cry");
        }
    }
}