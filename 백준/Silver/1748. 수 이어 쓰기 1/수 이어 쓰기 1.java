import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long answer = 0;
        int length = 1;
        int start = 1;

        while (start * 10 <= N) {
            int end = start * 10 - 1;
            answer += (long)(end - start + 1) * length;
            start *= 10;
            length++;
        }

        answer += (long)(N - start + 1) * length;
        System.out.println(answer);
    }
}