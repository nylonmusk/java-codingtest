import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minNumber = Integer.MAX_VALUE;
        int oddSum = 0;
        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num % 2 != 0) {
                oddSum += num;
                minNumber = Math.min(minNumber, num);
            }
        }
        System.out.println(minNumber == Integer.MAX_VALUE ? -1 : oddSum + "\n" + minNumber);
    }
}