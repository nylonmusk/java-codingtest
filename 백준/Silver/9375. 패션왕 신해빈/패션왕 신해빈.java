import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String temp = br.readLine().split(" ")[1];
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }

            Iterator<Integer> it = map.values().iterator();
            int answer = 1;

            while (it.hasNext()) {
                answer *= it.next().intValue() + 1;
            }
            sb.append(answer - 1).append("\n");
        }
        System.out.println(sb);
    }
}
