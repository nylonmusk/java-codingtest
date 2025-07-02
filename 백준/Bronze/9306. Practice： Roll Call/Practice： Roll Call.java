import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            String firstName = br.readLine();
            String lastName = br.readLine();
            System.out.println("Case " + i + ": " + lastName + ", " + firstName);
        }
    }
}