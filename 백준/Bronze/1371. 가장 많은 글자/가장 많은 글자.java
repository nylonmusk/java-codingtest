import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int[] alphabet = new int[26];
        while ((s = br.readLine()) != null) {
            for (char c : s.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    alphabet[c - 'a']++;
                }
            }
        }

        int maxCount = 0;
        for (int count : alphabet) {
            maxCount = Math.max(maxCount, count);
        }
        
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == maxCount) {
                answer.append((char) (i + 'a'));
            }
        }

        System.out.println(answer);
    }
}
