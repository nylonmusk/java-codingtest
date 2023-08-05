import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> mapX = new HashMap<>();
        Map<Integer, Integer> mapY = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            mapX.put(x, mapX.getOrDefault(x, 0) + 1);
            mapY.put(y, mapY.getOrDefault(y, 0) + 1);
        }
        StringBuilder answer = new StringBuilder();
        for (int i : mapX.keySet()) {
            if (mapX.get(i) == 1) answer.append(i).append(" ");
        }

        for (int i : mapY.keySet()) {
            if (mapY.get(i) == 1) answer.append(i);
        }
        System.out.println(answer);
    }
}

