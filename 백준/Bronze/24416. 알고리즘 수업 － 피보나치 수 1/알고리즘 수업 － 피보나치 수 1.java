import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        System.out.println(fib(n, count) + " " + (n - 2));
    }

    static int fib(int n, int count) {
        count++;
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1, count + 1) + fib(n - 2, count + 1);
        }
    }
}
