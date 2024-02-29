import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int maxPrize = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] dice = new int[3];
            for (int j = 0; j < 3; j++) {
                dice[j] = Integer.parseInt(st.nextToken());
            }
            int prize = calculatePrize(dice);
            if (prize > maxPrize) {
                maxPrize = prize;
            }
        }

        System.out.println(maxPrize);
    }

    private static int calculatePrize(int[] dice) {
        int[] count = new int[7];

        for (int num : dice) {
            count[num]++;
        }

        int maxCount = 0;
        int maxNum = 0;

        for (int i = 1; i <= 6; i++) {
            if (count[i] >= maxCount) {
                maxCount = count[i];
                maxNum = i;
            }
        }

        if (maxCount == 3) {
            return 10000 + maxNum * 1000;
        } else if (maxCount == 2) {
            return 1000 + maxNum * 100;
        } else {
            return maxNum * 100;
        }
    }
}
