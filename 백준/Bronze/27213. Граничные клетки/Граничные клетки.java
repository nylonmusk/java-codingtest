import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if (m == 1 && n == 1) {
            System.out.println(1);
        } else if (m == 1) {
            System.out.println(n);
        } else if (n == 1) {
            System.out.println(m);
        } else {
            System.out.println(2 * m + 2 * n - 4);
        }
    }
}