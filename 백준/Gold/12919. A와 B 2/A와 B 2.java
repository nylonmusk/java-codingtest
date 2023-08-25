import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean isValid = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();
        recursion(T, S);
        System.out.println(isValid ? 1 : 0);
    }

    static void recursion(String word, String S) {
        if (word.length() == S.length()) {
            if (word.equals(S)) {
                isValid = true;
            }
            return;
        }

        if (word.charAt(word.length() - 1) == 'A') recursion(word.substring(0, word.length() - 1), S);
        if (word.charAt(0) == 'B') recursion(new StringBuilder(word.substring(1, word.length())).reverse().toString(), S);
    }
}