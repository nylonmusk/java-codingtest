import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];
        int MAX = 1_000_000;
        int[] freq = new int[MAX + 1];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            freq[nums[i]]++;
        }

        int[] hitCount = new int[MAX + 1];
        for (int x = 1; x <= MAX; x++) {
            if (freq[x] == 0) continue;
            for (int m = x; m <= MAX; m += x) {
                if (freq[m] > 0) {
                    hitCount[m] += freq[x];
                }
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            answer.append(hitCount[nums[i]] - 1).append("\n");
        }

        System.out.print(answer);
    }
}