import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());

        double euclideanArea = Math.PI * R * R;

        double taxiArea = 2.0 * R * R;

        System.out.printf("%.6f\n", euclideanArea);
        System.out.printf("%.6f\n", taxiArea);
    }
}