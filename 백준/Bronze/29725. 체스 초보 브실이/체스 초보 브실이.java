import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int white = 0;
        int black = 0;
        for (int i = 0; i < 8; i++) {
            for (char c : br.readLine().toCharArray()) {
                if (c == '.') continue;
                if (Character.isUpperCase(c)) {
                    if (c == 'P') white += 1;
                    if (c == 'N' || c == 'B') white += 3;
                    if (c == 'R') white += 5;
                    if (c == 'Q') white += 9;
                } else {
                    if (c == 'p') black += 1;
                    if (c == 'n' || c == 'b') black += 3;
                    if (c == 'r') black += 5;
                    if (c == 'q') black += 9;
                }
            }
        }
        System.out.println(white - black);
    }
}
