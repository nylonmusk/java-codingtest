import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int A = 0;
        int B = 0;
        if (s.length() == 2) {
            A = s.charAt(0) - 48;
            B = s.charAt(1) - 48;
        } else if (s.length() == 3 && s.charAt(1) - 48 == 0) {
            A = 10;
            B = s.charAt(2) - 48;
        } else if (s.length() == 3 && s.charAt(2) - 48 == 0) {
            A = s.charAt(0) - 48;
            B = 10;
        } else {
            A = 10;
            B = 10;
        }
        System.out.println(A + B);
    }
}