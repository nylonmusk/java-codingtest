import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String socks = br.readLine();

        int whiteCount = 0;
        int blackCount = 0;

        for (int i = 0; i < socks.length(); i++) {
            if (socks.charAt(i) == 'B') {
                whiteCount++;
            } else if (socks.charAt(i) == 'C') {
                blackCount++;
            }
        }

        System.out.println((whiteCount / 2) + (blackCount / 2));
    }
}