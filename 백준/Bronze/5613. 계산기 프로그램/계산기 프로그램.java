import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = Integer.parseInt(br.readLine());

        while (true) {
            String operation = br.readLine();

            if (operation.equals("=")) {
                System.out.println(result);
                break;
            }

            char operator = operation.charAt(0);
            int number = Integer.parseInt(br.readLine());

            switch (operator) {
                case '+':
                    result += number;
                    break;
                case '-':
                    result -= number;
                    break;
                case '*':
                    result *= number;
                    break;
                case '/':
                    result /= number;
                    break;
                default:
                    break;
            }
        }

    }
}