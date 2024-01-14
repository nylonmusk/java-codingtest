import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hexNumber = br.readLine();
        int decimalNumber = Integer.parseInt(hexNumber, 16);
        System.out.println(decimalNumber);
    }
}
