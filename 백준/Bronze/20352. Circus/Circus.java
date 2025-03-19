import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());

        double circumference = 2 * Math.PI * Math.sqrt(a / Math.PI);

        System.out.printf("%.10f\n", circumference);
    }
}