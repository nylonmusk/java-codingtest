import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());

        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < N; i++) {
            int cur = Integer.parseInt(st.nextToken());
            int g = gcd(first, cur);
            answer.append(first / g).append("/").append(cur / g).append("\n");
        }
        System.out.print(answer);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}