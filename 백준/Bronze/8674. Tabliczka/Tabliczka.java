import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        long[] answer = new long[2];
        answer[0] = Long.parseLong(input[0]);
        answer[1] = Long.parseLong(input[1]);

        if (answer[0] % 2 == 0 || answer[1] % 2 == 0) {
            System.out.println(0);
        } else {
            Arrays.sort(answer);
            System.out.println(answer[0]);
        }
    }
}