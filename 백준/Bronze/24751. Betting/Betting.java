import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        double ratio1 = 100.0 / a;
        double ratio2 = 100.0 / (100 - a);

        System.out.printf("%.10f\n", ratio1);
        System.out.printf("%.10f\n", ratio2);
    }
}