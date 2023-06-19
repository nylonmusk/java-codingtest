import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        int total = 0;
        String s = "";
        while ((s = br.readLine()) != null) {
            if (s.isEmpty()) {
                break;
            }
            map.put(s, map.getOrDefault(s, 0) + 1);
            total++;
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        for (int i = 0; i < map.size(); i++) {
            sb.append(keySet.get(i)).append(" ");
            sb.append(String.format("%.4f", ((double) map.get(keySet.get(i)) * 100 / total))).append("\n");
        }

        System.out.println(sb);
    }
}
