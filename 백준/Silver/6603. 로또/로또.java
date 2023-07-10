import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    static int n;
    static int[] numbers;
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if (n == 0) break;
            
            numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
            List<Integer> lotto = new ArrayList<>();
            getLotto(lotto, 0);
            answer.append("\n");
        }
        System.out.println(answer);
    }

    private static void getLotto(List<Integer> lotto, int start) {
        if (lotto.size() == 6) {
            for (int l : lotto) {
                answer.append(l).append(" ");
            }
            answer.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            lotto.add(numbers[i]);
            getLotto(lotto, i + 1);
            lotto.remove(lotto.size() - 1);
        }
    }
}
