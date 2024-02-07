import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] tall = new int[N + 1];
        List<Integer> line = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            tall[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = N; i >= 1; i--) {
            line.add(tall[i], i);
        }

        StringBuilder answer = new StringBuilder();
        for (int l : line) {
            answer.append(l).append(" ");
        }
        System.out.println(answer.toString().trim());
    }
}
