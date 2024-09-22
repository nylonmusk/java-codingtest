import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            int N = Integer.parseInt(br.readLine());
            int answer = Integer.MAX_VALUE;

            for (int a = 1; a * a * a <= N; a++) {
                if (N % a == 0) {
                    for (int b = a; b * b <= N / a; b++) {
                        if ((N / a) % b == 0) {
                            int c = N / (a * b);
                            int surfaceArea = 2 * (a * b + b * c + c * a);
                            answer = Math.min(answer, surfaceArea);
                        }
                    }
                }
            }
            System.out.println(answer);
        }
    }
}