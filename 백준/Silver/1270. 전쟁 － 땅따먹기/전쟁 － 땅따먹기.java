import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int Ti = Integer.parseInt(st.nextToken());
            Map<Long, Integer> map = new HashMap<>();
            long dominator = 0;

            for (int j = 0; j < Ti; j++) {
                long army = Long.parseLong(st.nextToken());
                int count = map.getOrDefault(army, 0) + 1;
                map.put(army, count);

                if (count > Ti / 2) {
                    dominator = army;
                }
            }

            if (dominator != 0) answer.append(dominator).append("\n");
            else answer.append("SYJKGW").append("\n");
        }

        System.out.print(answer);
    }
}