import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int topBottom = 0;
        int leftRight = 0;

        for (int i = 0; i < N; i++) {
            String slats = br.readLine();
            if (slats.charAt(0) == '0') topBottom++;
            if (slats.charAt(1) == '0') topBottom++;
            if (slats.charAt(2) == '0') leftRight++;
            if (slats.charAt(3) == '0') leftRight++;
        }

        int swords = Math.min(topBottom / 2, leftRight / 2);

        int remainingTopBottom = topBottom - (swords * 2);
        int remainingLeftRight = leftRight - (swords * 2);

        System.out.println(swords + " " + remainingTopBottom + " " + remainingLeftRight);
    }
}