import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            map.put(s.split(" ")[0], s.split(" ")[1]);
        }
        for (int i = 0; i < M; i++) {
            sb.append(map.get(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }
}