import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());

            List<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < B; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);

            int count = 0;

            for (int j : list) {
                if (A - j >= 0) {
                    A -= j;
                    count++;
                } else {
                    break;
                }
            }

            answer.append("Case #" + i + ": " + count).append("\n");
        }
        System.out.println(answer);
    }
}