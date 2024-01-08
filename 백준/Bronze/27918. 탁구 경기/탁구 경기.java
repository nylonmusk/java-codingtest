import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int D = 0, P = 0;

        for (int i = 0; i < N; i++) {
            String winner = br.readLine();
            if (winner.equals("D")) {
                D++;
            } else {
                P++;
            }

            if (D >= P + 2 || P >= D + 2) {
                break;
            }
        }

        System.out.println(D + ":" + P);
    }
}
