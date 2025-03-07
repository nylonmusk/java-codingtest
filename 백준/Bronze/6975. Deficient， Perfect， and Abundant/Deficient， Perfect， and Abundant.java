import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            int sum = 0;

            for (int j = 1; j <= num / 2; j++) {
                if (num % j == 0) {
                    sum += j;
                }
            }

            if (sum == num) {
                System.out.println(num + " is a perfect number.\n");
            } else if (sum < num) {
                System.out.println(num + " is a deficient number.\n");
            } else {
                System.out.println(num + " is an abundant number.\n");
            }
        }
    }
}