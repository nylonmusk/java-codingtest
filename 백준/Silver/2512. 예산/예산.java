import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] money = new int[N];
        int maxMoney = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            money[i] = Integer.parseInt(st.nextToken());
            maxMoney = Math.max(maxMoney, money[i]);
        }
        int M = Integer.parseInt(br.readLine());

        while (true) {
            int answer = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (money[i] - maxMoney <= 0) {
                    sum += money[i];
                    answer = Math.max(answer, money[i]);
                } else {
                    sum += maxMoney;
                    answer = Math.max(answer, maxMoney);
                }
            }

            if (sum <= M) {
                System.out.println(answer);
                break;
            } else {
                maxMoney -= 1;
            }
        }
    }
}