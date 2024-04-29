import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while (true) {
            int lowerCase = 0;
            int upperCase = 0;
            int number = 0;
            int blank = 0;

            String s = br.readLine();
            if (s == null || s.isEmpty()) {
                break;
            }

            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (Character.isLowerCase(c)) {
                        lowerCase++;
                    } else {
                        upperCase++;
                    }
                } else if (c == ' ') {
                    blank++;
                } else {
                    number++;
                }
            }
            answer.append(lowerCase).append(" ")
                    .append(upperCase).append(" ")
                    .append(number).append(" ")
                    .append(blank).append("\n");
        }
        
        System.out.println(answer);
    }
}
