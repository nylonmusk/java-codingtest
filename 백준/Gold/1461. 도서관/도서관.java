import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int position = Integer.parseInt(st.nextToken());
            if (position > 0) {
                positive.add(position);
            } else {
                negative.add(-position);
            }
        }

        positive.sort(Comparator.reverseOrder());
        negative.sort(Comparator.reverseOrder());

        if (positive.isEmpty()) {
            answer += negative.get(0);
        } else if (negative.isEmpty()) {
            answer += positive.get(0);
        } else {
            answer += 2 * Math.min(positive.get(0), negative.get(0));
            answer += Math.max(positive.get(0), negative.get(0));
        }
        for (int i = M; i < positive.size(); i += M) {
            answer += 2 * positive.get(i);
        }

        for (int i = M; i < negative.size(); i += M) {
            answer += 2 * negative.get(i);
        }
        System.out.println(answer);
    }
}
