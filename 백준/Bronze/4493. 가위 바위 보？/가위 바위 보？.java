import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int p1score = 0;
            int p2score = 0;
            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String p1 = st.nextToken();
                String p2 = st.nextToken();
                if (p1.equals("R") && p2.equals("P")) {
                    p2score++;
                }
                if (p1.equals("R") && p2.equals("S")) {
                    p1score++;
                }
                if (p1.equals("S") && p2.equals("R")) {
                    p2score++;
                }
                if (p1.equals("S") && p2.equals("P")) {
                    p1score++;
                }
                if (p1.equals("P") && p2.equals("R")) {
                    p1score++;
                }
                if (p1.equals("P") && p2.equals("S")) {
                    p2score++;
                }
            }

            if (p1score > p2score) answer.append("Player 1");
            if (p1score < p2score) answer.append("Player 2");
            if (p1score == p2score) answer.append("TIE");
            answer.append("\n");
        }
        
        System.out.println(answer);
    }
}
