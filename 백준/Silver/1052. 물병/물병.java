import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int ans = 0;

        while (Integer.bitCount(n) > k) {
            int lowestSetBit = n & -n;
            ans += lowestSetBit;
            n += lowestSetBit;
        }
        System.out.println(ans);
    }
}
