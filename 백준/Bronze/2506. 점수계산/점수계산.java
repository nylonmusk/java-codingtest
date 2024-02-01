import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int answer = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (list.get(i) == 1) {
                count++;
                answer += count;
            } else {
                count = 0;
            }
        }

        System.out.println(answer);
    }
}