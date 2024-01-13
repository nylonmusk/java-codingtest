import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            String lastRound = determineLastRound(N);
            System.out.println("Case #" + i + ": " + lastRound);
        }
    }

    private static String determineLastRound(int rank) {
        if (rank <= 25) {
            return "World Finals";
        } else if (rank <= 1000) {
            return "Round 3";
        } else if (rank <= 4500) {
            return "Round 2";
        } else {
            return "Round 1";
        }
    }
}
