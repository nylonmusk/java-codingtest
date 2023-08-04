import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] nums;
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        permutation(0, new int[M]);
        System.out.println(answer.toString());
    }

    static void permutation(int depth, int[] arr) {
        if (depth == M) {
            for (int i : arr) {
                answer.append(i).append(" ");
            }
            answer.append("\n");
            return;
        }

        int previous = -1;
        for (int i = 0; i < N; i++) {
            if (previous != nums[i]) {
                previous = nums[i];
                arr[depth] = previous;
                permutation(depth + 1, arr);
            }
        }
    }
}
