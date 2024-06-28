import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int A = 0;
        int B = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                i++;
                A += s.charAt(i) - 48;

            } else {
                i++;
                B += s.charAt(i) - 48;
            }
        }
        System.out.println(A > B ? "A" : "B");
    }
}
