import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] alphabet = new long[26];
        while (N-- > 0) {
            String s = br.readLine();
            long length = s.length() - 1;
            for (char c : s.toCharArray()) {
                alphabet[c - 65] += (long)Math.pow(10, length);
                length--;
            }
        }

        Arrays.sort(alphabet);
        int x = 9;
        long answer = 0;
        for (int i = 25; i >= 0; i--) {
            answer += alphabet[i] * x--;
        }
        System.out.println(answer);
    }
}
