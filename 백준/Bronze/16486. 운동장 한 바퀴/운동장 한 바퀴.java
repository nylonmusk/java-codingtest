import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double d1 = Double.parseDouble(br.readLine());
        double d2 = Double.parseDouble(br.readLine());

        double pi = 3.141592;

        double perimeter = 2 * d1 + 2 * pi * d2;

        System.out.printf("%.6f\n", perimeter);
    }
}
