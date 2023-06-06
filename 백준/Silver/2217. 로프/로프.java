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
        List<Integer> rope = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            rope.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(rope, Collections.reverseOrder());
        int max = 0;
        for (int i = 0; i < N; i++) {
            int sum = rope.get(i) * (i + 1);
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}