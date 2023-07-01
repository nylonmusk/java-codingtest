import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int A = 300;
        int B = 60;
        int C = 10;
        answer.append(N / A).append(" ");
        N %= A;
        answer.append(N / B).append(" ");
        N %= B;
        answer.append(N / C);
        N %= C;
        if (N != 0) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
}
