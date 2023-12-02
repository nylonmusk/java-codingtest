import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int n = 1;
        int d = 1;
        boolean increasing = true;

        for (int i = 1; i < X; i++) {
            if (increasing) {
                if (n == 1) {
                    increasing = false;
                    d++;
                } else {
                    n--;
                    d++;
                }
            } else {
                if (d == 1) {
                    increasing = true;
                    n++;
                } else {
                    n++;
                    d--;
                }
            }
        }

        System.out.println(n + "/" + d);
    }
}
