import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> keywords = new HashSet<>();

        for (int i = 0; i < N; i++) {
            keywords.add(br.readLine());
        }

        int count = N;

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < M; i++) {
            for (String s : br.readLine().split(",")) {
                if (keywords.contains(s)) {
                    count--;
                    keywords.remove(s);
                }
            }
            answer.append(count).append("\n");
        }

        System.out.println(answer);
    }
}
