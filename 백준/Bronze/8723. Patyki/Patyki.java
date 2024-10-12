import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int[] sticks = {a, b, c};
        Arrays.sort(sticks);

        if (sticks[0] == sticks[1] && sticks[1] == sticks[2]) {
            System.out.println(2);
        }
        else if (sticks[0] * sticks[0] + sticks[1] * sticks[1] == sticks[2] * sticks[2]) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}