import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    private static long N;
    private static int[] dice = new int[6];
    private static int[][] adjacentPairs = {
            {0, 1}, {0, 2}, {0, 4}, {0, 3}, {0, 5},
            {1, 2}, {1, 4}, {1, 3}, {1, 5},
            {2, 4}, {2, 3}, {2, 5},
            {3, 4}, {3, 5},
            {4, 5}
    };

    private static int[][] adjacentTriplets = {
            {0, 1, 2}, {0, 1, 3}, {0, 2, 4}, {0, 3, 4},
            {5, 1, 2}, {5, 1, 3}, {5, 2, 4}, {5, 3, 4}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < 6; i++) {
            dice[i] = Integer.parseInt(input[i]);
        }

        if (N == 1) {
            int max = 0, sum = 0;
            for (int val : dice) {
                sum += val;
                max = Math.max(max, val);
            }
            System.out.println(sum - max);
            return;
        }

        long min1 = Arrays.stream(dice).min().getAsInt();
        long min2 = Long.MAX_VALUE;
        long min3 = Long.MAX_VALUE;

        for (int[] pair : adjacentPairs) {
            int a = pair[0], b = pair[1];
            if (a + b != 5) {
                min2 = Math.min(min2, dice[a] + dice[b]);
            }
        }

        for (int[] triplet : adjacentTriplets) {
            int a = triplet[0], b = triplet[1], c = triplet[2];
            if (a + b != 5 && b + c != 5 && a + c != 5) {
                min3 = Math.min(min3, dice[a] + dice[b] + dice[c]);
            }
        }

        long three = 4;
        long two = (N - 2) * 8 + 4;
        long one = (N - 2) * (N - 2) + (N - 2) * (N - 1) * 4;

        long result = three * min3 + two * min2 + one * min1;
        System.out.println(result);
    }
}