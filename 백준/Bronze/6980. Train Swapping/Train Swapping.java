import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int L = Integer.parseInt(br.readLine());
            int[] train = new int[L];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < L; j++) {
                train[j] = Integer.parseInt(st.nextToken());
            }

            int count = sort(train);
            System.out.println("Optimal train swapping takes " + count + " swaps.");
        }
    }

    private static int sort(int[] train) {
        int swapCount = 0;
        int n = train.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (train[j] > train[j + 1]) {
                    int temp = train[j];
                    train[j] = train[j + 1];
                    train[j + 1] = temp;

                    swapCount++;
                }
            }
        }

        return swapCount;
    }
}