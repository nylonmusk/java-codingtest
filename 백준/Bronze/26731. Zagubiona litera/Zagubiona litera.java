import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toUpperCase();

        boolean[] alphabet = new boolean[26];

        for (char c : s.toCharArray()) {
            alphabet[c - 65] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] == false) {
                System.out.println((char)(i + 65));
                return;
            }
        }
    }
}
