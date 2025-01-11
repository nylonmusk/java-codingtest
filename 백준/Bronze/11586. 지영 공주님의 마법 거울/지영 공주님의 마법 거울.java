import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] mirror = new String[N];
        for (int i = 0; i < N; i++) {
            mirror[i] = br.readLine();
        }
        int K = Integer.parseInt(br.readLine());

        if (K == 1) {
            for (String line : mirror) {
                System.out.println(line);
            }
        } else if (K == 2) {
            for (String line : mirror) {
                System.out.println(new StringBuilder(line).reverse().toString());
            }
        } else if (K == 3) {
            for (int i = N - 1; i >= 0; i--) {
                System.out.println(mirror[i]);
            }
        }
    }
}