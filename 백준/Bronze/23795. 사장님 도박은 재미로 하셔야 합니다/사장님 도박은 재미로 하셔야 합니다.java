import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            answer += n;
        }
        System.out.println(answer);
    }
}
