import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int K = Integer.parseInt(input[2]);

        while (K > 0) {
            if (N >= M * 2) {
                N--;
            } else {
                M--;
            }
            K--;
        }

        int maxTeams = Math.min(N / 2, M);

        System.out.println(maxTeams);
    }
}