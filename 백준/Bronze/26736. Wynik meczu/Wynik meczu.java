import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int aCount = 0;
        int bCount = 0;

        for (char ch : input.toCharArray()) {
            if (ch == 'A') {
                aCount++;
            } else if (ch == 'B') {
                bCount++;
            }
        }

        System.out.println(aCount + " : " + bCount);
    }
}