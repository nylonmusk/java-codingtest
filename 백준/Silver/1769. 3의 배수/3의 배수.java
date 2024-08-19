import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;
        int sum = sum(s);

        while (sum >= 10) {
            count++;
            sum = sum(String.valueOf(sum));
        }

        if (s.length() > 1) {
            count++;
        }

        System.out.println(count);
        if (sum % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static int sum(String number) {
        int sum = 0;
        for (char c : number.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}