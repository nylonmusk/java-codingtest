import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alphabet = new int[26];
        for (char c : s.toCharArray()) {
            alphabet[c - 'a'] += 1;
        }

        StringBuilder answer = new StringBuilder();
        for (int i : alphabet) {
            answer.append(i).append("\n");
        }

        System.out.println(answer);
    }
}
