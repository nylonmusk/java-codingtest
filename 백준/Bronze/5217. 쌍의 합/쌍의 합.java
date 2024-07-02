import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            answer.append("Pairs for " + n + ":");

            int start = 1;
            int end = n - 1;
            while (start < end) {
                answer.append(" " + start + " " + end);
                answer.append(",");
                start++;
                end--;
            }
            if (answer.charAt(answer.length() - 1) == ',') {
               answer.replace(answer.length() - 1, answer.length(), "");
            }
            answer.append("\n");
        }

        System.out.println(answer);
    }
}
