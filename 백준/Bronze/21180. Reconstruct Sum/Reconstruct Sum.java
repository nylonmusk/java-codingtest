import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            totalSum += numbers[i];
        }

        for (int num : numbers) {
            if (num == totalSum - num) {
                System.out.println(num);
                return;
            }
        }

        System.out.println("BAD");
    }
}