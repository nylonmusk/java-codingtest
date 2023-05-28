import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int GCD = GCD(A, B);
        int LCM = LCM(A, B, GCD);

        System.out.println(GCD + "\n" + LCM);
    }

    private static int GCD(int A, int B) {
        while (B != 0) {
            int r = A % B;
            A = B;
            B = r;
        }
        return A;
    }

    private static int LCM(int A, int B, int GCD) {
        return A * B / GCD;
    }
}