import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> log = new HashMap<>();
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String check = st.nextToken();
            if (check.equals("enter")) {
                log.put(name, log.getOrDefault(name, 0) + 1);
            } else {
                log.put(name, log.getOrDefault(name, 0) - 1);
            }
        }
        List<String> keySet = new ArrayList<>(log.keySet());
        Collections.sort(keySet, Collections.reverseOrder());
        for (String s : keySet) {
            if (log.get(s) != 0) {
                sb.append(s).append("\n");
            }
        }
        System.out.println(sb);
    }
}
