import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        
        int n = Integer.parseInt(br.readLine());
        String[] titles = new String[n];
        int[] costs = new int[n];

        for (int i = 0; i < n; i++) {
            String[] book = br.readLine().split(" ");
            costs[i] = Integer.parseInt(book[0]);
            titles[i] = book[1];
        }

        int total = 1 << n;
        int answer = -1;

        for (int i = 1; i < total; i++) {
            int[] cnt = new int[26];
            int costSum = 0;

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    String bookTitle = titles[j];
                    for (int k = 0; k < bookTitle.length(); k++) {
                        cnt[bookTitle.charAt(k) - 'A']++;
                    }
                    costSum += costs[j];
                }
            }

            if (check(cnt, target)) {
                if (answer == -1) {
                    answer = costSum;
                } else {
                    answer = Math.min(answer, costSum);
                }
            }
        }

        System.out.println(answer);
    }

    public static boolean check(int[] cnt, String target) {
        for (int i = 0; i < target.length(); i++) {
            if (cnt[target.charAt(i) - 'A'] == 0) {
                return false;
            }
            cnt[target.charAt(i) - 'A']--;
        }
        return true;
    }
}
