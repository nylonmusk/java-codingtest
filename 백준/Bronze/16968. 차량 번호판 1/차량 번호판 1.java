import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String format = br.readLine();

        int result = 1;

        for (int i = 0; i < format.length(); i++) {
            char current = format.charAt(i);

            if (current == 'c') {
                if (i > 0 && format.charAt(i - 1) == 'c') {
                    result *= 25;
                } else {
                    result *= 26;
                }
            } else if (current == 'd') {
                if (i > 0 && format.charAt(i - 1) == 'd') {
                    result *= 9;
                } else {
                    result *= 10;
                }
            }
        }

        System.out.println(result);
    }
}