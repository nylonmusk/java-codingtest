import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        
        int answer = 0;
        if (N == 1) {
            answer = 1;
        } else {
            int[][] dp = new int[N + 1][N + 1];
            Arrays.sort(nums);
            for (int i = 1; i < N; i++) {
                for (int j = i + 1; j <= N; j++) {
                    dp[i][j] = 2;
                    int pre = 2 * nums[i] - nums[j];
                    int left = 1;
                    int right = i - 1;
                    int mid;

                    while (left < right) {
                        mid = (left + right) / 2;
                        if (nums[mid] < pre) {
                            left = mid + 1;

                        } else if (nums[mid] == pre && nums[right] == pre) {
                            left = mid + 1;
                        } else {
                            right = mid;
                        }
                    }
                    if (nums[right] == pre) {
                        dp[i][j] = Math.max(dp[i][j], dp[right][i] + 1);
                    }
                    answer = Math.max(answer, dp[i][j]);
                }
            }
        }
        System.out.println(answer);
    }
}
