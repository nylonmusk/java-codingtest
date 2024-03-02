import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int totalCash = Integer.parseInt(st.nextToken());

        int[] problemsSolved = new int[n];

        for (int i = 0; i < n; i++) {
            problemsSolved[i] = Integer.parseInt(br.readLine());
        }

        int rewardPerProblem = totalCash / sum(problemsSolved);

        for (int i = 0; i < n; i++) {
            System.out.println(problemsSolved[i] * rewardPerProblem);
        }
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
