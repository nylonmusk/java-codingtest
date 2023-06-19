import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int prize = 0;
            if (a == 1) {
                prize = 5000000;
            } else if (1 < a && a <= 3) {
                prize = 3000000;
            } else if (3 < a && a <= 6) {
                prize = 2000000;
            } else if (6 < a && a <= 10) {
                prize = 500000;
            } else if (10 < a && a <= 15) {
                prize = 300000;
            } else if (15 < a && a <= 21) {
                prize = 100000;
            }

            if (b == 1) {
                prize += 5120000;
            } else if (1 < b && b <= 3) {
                prize += 2560000;
            } else if (3 < b && b <= 7) {
                prize += 1280000;
            } else if (7 < b && b <= 15) {
                prize += 640000;
            } else if (15 < b && b <= 31) {
                prize += 320000;
            }
            answer.append(prize).append("\n");
        }
        System.out.println(answer);
    }
}
