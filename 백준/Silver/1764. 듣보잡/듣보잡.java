import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> hear = new HashSet<>();
        List<String> see = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            hear.add(br.readLine());
        }
        for (int j = 0; j < M; j++) {
            see.add(br.readLine());
        }
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            if (hear.contains(see.get(i))) {
                answer.add(see.get(i));
            }
        }
        sb.append(answer.size()).append("\n");
        Collections.sort(answer);
        for (String s : answer) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
