import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long num1 = Long.parseLong(st.nextToken());
            String operator = st.nextToken();
            long num2 = Long.parseLong(st.nextToken());
            st.nextToken();
            long result = Long.parseLong(st.nextToken());

            boolean isCorrect = false;

            switch (operator) {
                case "+":
                    isCorrect = (num1 + num2 == result);
                    break;
                case "-":
                    isCorrect = (num1 - num2 == result);
                    break;
                case "*":
                    isCorrect = (num1 * num2 == result);
                    break;
                case "/":
                    isCorrect = (num1 / num2 == result);
                    break;
            }

            answer.append(isCorrect ? "correct" : "wrong answer").append("\n");
        }

        System.out.print(answer);
    }
}