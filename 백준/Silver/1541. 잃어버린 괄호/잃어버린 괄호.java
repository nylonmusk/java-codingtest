import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();
        String[] numbers = expression.split("[+-]");
        String[] operators = expression.split("[0-9]+");

        int answer = Integer.parseInt(numbers[0]);
        boolean isMinus = false;

        for (int i = 1; i < operators.length; i++) {
            if (operators[i].equals("-")) {
                if (!isMinus) {
                    isMinus = true;
                }
            }

            if (isMinus) {
                answer -= Integer.parseInt(numbers[i]);
            } else {
                answer += Integer.parseInt(numbers[i]);
            }
        }
        System.out.println(answer);
    }
}
