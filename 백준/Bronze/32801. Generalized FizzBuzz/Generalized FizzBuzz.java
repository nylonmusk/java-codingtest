import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int fizzBuzzCount = n / lcm(a, b);
        int fizzCount = n / a - fizzBuzzCount;
        int buzzCount = n / b - fizzBuzzCount;

        System.out.println(fizzCount + " " + buzzCount + " " + fizzBuzzCount);
    }

    private static int gcd(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    private static int lcm(int x, int y) {
        return x / gcd(x, y) * y;
    }
}