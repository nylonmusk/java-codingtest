import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A = N;
        int count = 0;
        do {
            count++;
            int leftNum = A % 10;
            int rightNum = 0;
            while (A != 0) {
                rightNum += A % 10;
                A /= 10;
            }
            A = Integer.parseInt(String.valueOf(leftNum % 10) + rightNum % 10);
        } while (N != A);
        System.out.println(count);
    }
}
