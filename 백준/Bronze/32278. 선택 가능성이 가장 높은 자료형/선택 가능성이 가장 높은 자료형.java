import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        if (N >= -32768 && N <= 32767) {
            System.out.println("short");
        } else if (N >= -2147483648L && N <= 2147483647L) {
            System.out.println("int");
        } else {
            System.out.println("long long");
        }
    }
}