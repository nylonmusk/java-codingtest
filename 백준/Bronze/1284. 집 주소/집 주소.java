import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null && !input.equals("0")) {
            int totalWidth = 1;

            for (char digit : input.toCharArray()) {
                if (digit == '1') {
                    totalWidth += 2;
                } else if (digit == '0') {
                    totalWidth += 4;
                } else {
                    totalWidth += 3;
                }
                totalWidth += 1;
            }

            totalWidth += 1;
            System.out.println(totalWidth - 1);
        }
    }
}
