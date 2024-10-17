import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;
        int len = s.length();

        for (int i = 0; i <= len - 4; i++) {
            if (s.substring(i, i + 4).equals("kick")) {
                count++;
            }
        }

        System.out.println(count);
    }
}