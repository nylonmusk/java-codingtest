import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String answer = "Error";
        if (A == 60 && B == 60 && C == 60) {
            answer = "Equilateral";
        } else if (A + B + C == 180) {
            if (A == B || A == C || B == C) {
                answer = "Isosceles";
            } else {
                answer = "Scalene";
            }
        }
        System.out.println(answer);
    }
}
