import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = br.readLine();
            if (input.equals("0")) break;
            System.out.println(digitalRoot(input));
        }
    }

    public static int digitalRoot(String n) {
        while (n.length() > 1) {
            int sum = 0;
            for (int i = 0; i < n.length(); i++) {
                sum += n.charAt(i) - '0';
            }
            n = Integer.toString(sum);
        }
        return Integer.parseInt(n);
    }
}