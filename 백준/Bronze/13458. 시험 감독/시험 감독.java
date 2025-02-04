import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> people = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            people.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long answer = 0;

        for (int i = 0; i < N; i++) {
            int num = people.get(i);
            answer++;
            num -= B;

            if (num > 0) {
                answer += num / C;
                if (num % C != 0) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}