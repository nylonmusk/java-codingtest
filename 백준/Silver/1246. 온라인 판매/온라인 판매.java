import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] P = new int[M];
        for (int i = 0; i < M; i++) {
            P[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(P);

        int bestPrice = 0;
        int bestProfit = 0;

        for (int i = 0; i < M; i++) {
            int price = P[i];
            int count = M - i;
            count = Math.min(count, N);
            int profit = price * count;

            if (profit > bestProfit) {
                bestProfit = profit;
                bestPrice = price;
            }
        }

        System.out.println(bestPrice + " " + bestProfit);
    }
}