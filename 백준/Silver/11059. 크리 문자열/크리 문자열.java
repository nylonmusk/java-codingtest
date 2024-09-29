import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        int answer = 0;

        for (int length = 2; length <= n; length += 2) {
            for (int start = 0; start <= n - length; start++) {
                int mid = start + length / 2;
                String front = s.substring(start, mid);
                String back = s.substring(mid, start + length);

                if (getSum(front) == getSum(back)) {
                    answer = Math.max(answer, length);
                }
            }
        }

        System.out.println(answer);
    }

    private static int getSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        return sum;
    }
}