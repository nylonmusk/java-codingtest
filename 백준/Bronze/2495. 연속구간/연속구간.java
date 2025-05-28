import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int getMaxSequenceLength(String s) {
        char prev = s.charAt(0);
        int maxLen = 1;
        int curLen = 1;

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == prev) {
                curLen++;
            } else {
                curLen = 1;
                prev = curr;
            }
            if (curLen > maxLen) {
                maxLen = curLen;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            String input = br.readLine();
            System.out.println(getMaxSequenceLength(input));
        }
    }
}