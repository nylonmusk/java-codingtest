import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H1 = Integer.parseInt(st.nextToken());
        int B1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int H2 = Integer.parseInt(st.nextToken());
        int B2 = Integer.parseInt(st.nextToken());

        int player1Score = H1 * 3 + B1;
        int player2Score = H2 * 3 + B2;

        if (player1Score > player2Score) {
            System.out.println("1 " + (player1Score - player2Score));
        } else if (player2Score > player1Score) {
            System.out.println("2 " + (player2Score - player1Score));
        } else {
            System.out.println("NO SCORE");
        }
    }
}