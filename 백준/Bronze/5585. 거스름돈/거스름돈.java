import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        N = 1000 - N;
        answer += N / 500;
        N %= 500;
        answer += N / 100;
        N %= 100;
        answer += N / 50;
        N %= 50;
        answer += N / 10;
        N %= 10;
        answer += N / 5;
        N %= 5;
        answer += N / 1;
        System.out.println(answer);
    }
}
