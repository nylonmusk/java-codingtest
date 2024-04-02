import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Long> answer = new ArrayList<>();

        if (N <= 10) {
            System.out.println(N);
            return;
        }
        if (N > 1022) {
            System.out.println("-1");
            return;
        }

        for (int i = 0; i < 10; i++) {
            bp(i, 1, answer);
        }

        Collections.sort(answer);
        System.out.println(answer.get(N));
    }


    public static void bp(long num, int i, List<Long> answer) {
        if (i > 10) return;

        answer.add(num);
        for (int j = 0; j < num % 10; j++) {
            bp((num * 10) + j, i + 1, answer);
        }
    }
}
