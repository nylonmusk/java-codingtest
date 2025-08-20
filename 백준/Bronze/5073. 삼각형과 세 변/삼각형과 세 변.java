import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder answer = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            List<Integer> list = new ArrayList<>();
            list.add(a);
            list.add(b);
            list.add(c);

            Collections.sort(list);

            if (list.get(2) >= list.get(0) + list.get(1)) {
                answer.append("Invalid");
            } else if (list.get(0).equals(list.get(1)) && list.get(1).equals(list.get(2))) {
                answer.append("Equilateral");
            } else if (list.get(0).equals(list.get(1)) || list.get(1).equals(list.get(2))) {
                answer.append("Isosceles");
            } else {
                answer.append("Scalene");
            }
            answer.append("\n");
        }
        System.out.print(answer);
    }
}