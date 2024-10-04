import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (N == 0) {
            System.out.println(0);
            return;
        }

        st = new StringTokenizer(br.readLine());
        List<Integer> books = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            books.add(Integer.parseInt(st.nextToken()));
        }

        int answer = 1;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            if (sum + books.get(i) > M) {
                answer++;
                sum = books.get(i);
            } else {
                sum += books.get(i);
            }
        }

        System.out.println(answer);
    }
}