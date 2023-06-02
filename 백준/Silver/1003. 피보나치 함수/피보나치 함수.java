import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] zero = new int[41];
        int[] one = new int[41];
        zero[0] = 1;
        zero[1] = 0;
        zero[2] = 1;
        zero[3] = 1;
        for (int i = 4; i <= 40; i++) {
            zero[i] = zero[i - 1] + zero[i - 2];
        }
        one[0] = 0;
        one[1] = 1;
        one[2] = 1;
        for (int i = 3; i <= 40; i++) {
            one[i] = one[i - 1] + one[i - 2];
        }

        while (T-- > 0) {
            int temp = Integer.parseInt(br.readLine());
            sb.append(zero[temp]).append(" ").append(one[temp]).append("\n");
        }
        System.out.println(sb);
    }
}