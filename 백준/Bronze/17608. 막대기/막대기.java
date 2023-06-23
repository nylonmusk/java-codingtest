import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int answer = 1;

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        int front = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (list.get(i) - front > 0) {
                answer++;
            }
            front = Math.max(list.get(i), front);
        }

        System.out.println(answer - 1);
    }
}
