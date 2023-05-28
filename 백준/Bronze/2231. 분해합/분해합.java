import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        boolean b = false;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            int target = i;
            while (target != 0) {
                sum += target % 10;
                target /= 10;
            }
            if (i + sum == N) {
                sb.append(i);
                b = true;
                break;
            }
        }
        if (!b) {
            sb.append(0);
        }
        System.out.println(sb);
    }
}