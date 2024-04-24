import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int answer = 0;
        if (N > A) {
            answer += A;
        } else {
            answer += N;
        }

        if (N > B) {
            answer += B;
        } else {
            answer += N;
        }

        if (N > C) {
            answer += C;
        } else {
            answer += N;
        }

        System.out.println(answer);
    }
}
