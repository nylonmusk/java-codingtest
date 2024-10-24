import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String phoneNumber = br.readLine();

        String numbersOnly = phoneNumber.replace("-", "");

        Set<Character> uniqueDigits = new HashSet<>();

        for (char c : numbersOnly.toCharArray()) {
            uniqueDigits.add(c);
        }

        System.out.println(uniqueDigits.size());
    }
}