import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] solution = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            solution[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(solution);
        int answer1 = 0;
        int answer2 = 0;
        long min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int start = i + 1;
            int end = N - 1;

            while (start <= end) {
                int mid = (start + end) / 2;
                int sum = solution[i] + solution[mid];

                if (Math.abs(sum) < min) {
                    answer1 = i;
                    answer2 = mid;
                    min = Math.abs(sum);
                }

                if (sum < 0) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println(solution[answer1] + " " + solution[answer2]);
    }
}