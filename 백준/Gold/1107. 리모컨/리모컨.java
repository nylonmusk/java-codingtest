import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        Set<Integer> brokenButtons = new HashSet<>();
        if (M != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < M; i++) {
                brokenButtons.add(Integer.parseInt(st.nextToken()));
            }
        }
        int min = Math.abs(100 - N);

        for (int i = 0; i <= 5000000; i++) {
            int temp = i;
            boolean isValid = true;
            if (temp == 0) {
                if (brokenButtons.contains(0)) {
                    isValid = false;
                }
            }
            while (temp > 0) {
                if (brokenButtons.contains(temp % 10)) {
                    isValid = false;
                    break;
                }
                temp /= 10;
            }
            if (isValid) {
                min = Math.min(min, String.valueOf(i).length() + Math.abs(N - i));
            }
        }
        System.out.println(min);
    }
}
