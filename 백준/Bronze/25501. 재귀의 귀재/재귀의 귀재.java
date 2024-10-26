import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String S = br.readLine();
            int result = isPalindrome(S);
            answer.append(result).append(" ").append(count).append("\n");
        }
        System.out.print(answer);
    }

    public static int recursion(String s, int l, int r) {
        count++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        count = 0;
        return recursion(s, 0, s.length() - 1);
    }
}