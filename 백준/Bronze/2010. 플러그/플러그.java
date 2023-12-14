import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 1; i < N; i++) {
            int multitab = Integer.parseInt(br.readLine());
            answer += multitab - 1;
        }
        answer += Integer.parseInt(br.readLine());
        System.out.println(answer);
    }
}
