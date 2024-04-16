import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[N + 1];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i * i <= N; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    prime[j] = true;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (!prime[i]) {
                list.add(i);
            }
        }

        int start = 0;
        int end = 0;
        int sum = 0;
        int answer = 0;

        while (true) {
            if (sum >= N) {
                sum -= list.get(start++);
            } else if (end == list.size()) {
                break;
            } else {
                sum += list.get(end++);
            }
            if (N == sum) answer++;
        }
        System.out.println(answer);
    }
}