import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long answer = 1;
        long cat = 1;
        long N = Long.parseLong(br.readLine());

        while (cat < N) {
            answer++;
            cat *= 2;
        }

        System.out.println(N == 0 ? 0 : answer);
    }
}