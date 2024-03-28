import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (N-- > 0) {
            String s = br.readLine();
            answer.append(s);
            int countG = 0;
            int countB = 0;
            for (char c : s.toLowerCase().toCharArray()) {
                if (c == 'g') {
                    countG++;
                } else if (c == 'b') {
                    countB++;
                }
            }
            answer.append(" is ");
            if (countB == countG) {
                answer.append("NEUTRAL");
            } else if (countB > countG) {
                answer.append("A BADDY");
            } else {
                answer.append("GOOD");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
