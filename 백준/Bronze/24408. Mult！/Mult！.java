import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int firstNumber = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (firstNumber == 0) {
                firstNumber = num;
            } else if (num % firstNumber == 0) {
                System.out.println(num);
                firstNumber = 0;
            }
        }
    }
}