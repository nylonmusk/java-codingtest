import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int score = (P * 50) - (C * 10);
        if (P > C) {
            score += 500;
        }

        System.out.println(score);
    }
}