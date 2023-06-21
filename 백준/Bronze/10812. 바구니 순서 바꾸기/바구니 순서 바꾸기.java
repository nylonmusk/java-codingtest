import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<Integer> baskets = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            baskets.add(i);
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            List<Integer> rotatedBasket = new ArrayList<>();

            if (i != 1) {
                for (int a = 0; a < i - 1; a++) {
                    rotatedBasket.add(baskets.get(a));
                }
            }
            for (int b = k - 1; b < j; b++) {
                rotatedBasket.add(baskets.get(b));
            }

            for (int c = i - 1; c < k - 1; c++) {
                rotatedBasket.add(baskets.get(c));
            }

            for (int d = j; d < N; d++) {
                rotatedBasket.add(baskets.get(d));
            }
            baskets = List.copyOf(rotatedBasket);
        }
        for (int i : baskets) {
            answer.append(i).append(" ");
        }
        System.out.println(answer);
    }
}
