import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] nums;
    static int[] operators;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        operators = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(nums[0], 1);
        System.out.println(max + "\n" + min);
    }

    static void backTracking(int value, int index) {
        if (index == N) {
            max = Math.max(max, value);
            min = Math.min(min, value);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                if (i == 0) {
                    backTracking(value + nums[index], index + 1);
                    operators[i]++;
                } else if (i == 1) {
                    backTracking(value - nums[index], index + 1);
                    operators[i]++;
                } else if (i == 2) {
                    backTracking(value * nums[index], index + 1);
                    operators[i]++;
                } else {
                    backTracking(value / nums[index], index + 1);
                    operators[i]++;
                }
            }
        }
    }
}