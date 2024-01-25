import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int zeroLength = s.replaceAll("1", "").length();
        int oneLength = s.replaceAll("0", "").length();

        for (int i = 0; i < oneLength / 2; i++) {
            s = s.replaceFirst("1", "");
        }

        StringBuilder reverse = new StringBuilder(s);
        String reversedS = reverse.reverse().toString();

        for (int i = 0; i < zeroLength / 2; i++) {
            reversedS = reversedS.replaceFirst("0", "");
        }

        reverse = new StringBuilder(reversedS);

        System.out.println(reverse.reverse());
    }
}