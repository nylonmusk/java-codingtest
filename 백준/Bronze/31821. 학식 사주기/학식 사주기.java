import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        int[] prices = new int[N];

        for (int i = 0; i < N; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }

        int M = Integer.parseInt(br.readLine());

        int totalCost = 0;
        for (int i = 0; i < M; i++) {
            int cornerNumber = Integer.parseInt(br.readLine());
            totalCost += prices[cornerNumber - 1];
        }

        System.out.println(totalCost);
    }
}