import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        int totalTime = 0;

        if (A < 0) {
            totalTime += Math.abs(A) * C;
            totalTime += D;
            totalTime += B * E;
        } else if (A == 0) {
            totalTime += D;
            totalTime += B * E;
        } else {
            totalTime += (B - A) * E;
        }

        System.out.println(totalTime);
    }
}