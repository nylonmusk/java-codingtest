import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int wins = 0;

        for (int i = 0; i < 6; i++) {
            String result = br.readLine();
            if (result.equals("W")) {
                wins++;
            }
        }

        if (wins >= 5) {
            System.out.println(1);
        } else if (wins >= 3) {
            System.out.println(2);
        } else if (wins >= 1) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}