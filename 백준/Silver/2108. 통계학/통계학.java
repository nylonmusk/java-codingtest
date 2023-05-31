import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] numbers = new int[N];
        double sum = 0;
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }
        sb.append((int) Math.round(sum / N)).append("\n");

        Arrays.sort(numbers);
        sb.append(numbers[N / 2]).append("\n");

        int[] count = new int[8001];
        for (int i = 0; i < N; i++) {
            count[numbers[i] + 4000]++;
        }

        int mode = 0;
        int modeCount = 0;
        boolean isSecond = false;

        for (int i = 0; i < 8001; i++) {
            if (count[i] > modeCount) {
                modeCount = count[i];
                mode = i - 4000;
                isSecond = false;
            } else if (count[i] == modeCount && !isSecond) {
                mode = i - 4000;
                isSecond = true;
            }
        }
        sb.append(mode).append("\n");
        sb.append(numbers[N - 1] - numbers[0]).append("\n");
        System.out.println(sb);
    }
}