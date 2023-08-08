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
        List<Integer> list;
        while (T-- > 0) {
            list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 10; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            list.sort(Collections.reverseOrder());
            answer.append(list.get(2)).append("\n");
        }
        System.out.println(answer);
    }
}

