import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String X = br.readLine();
            HashSet<Character> uniqueDigits = new HashSet<>();

            for (char ch : X.toCharArray()) {
                uniqueDigits.add(ch);
            }

            System.out.println(uniqueDigits.size());
        }
    }
}