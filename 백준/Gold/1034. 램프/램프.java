import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] parts = br.readLine().split(" ");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        Map<String, Integer> map = new HashMap<>();
        List<String> lamps = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            lamps.add(row);
            map.put(row, map.getOrDefault(row, 0) + 1);
        }

        int K = Integer.parseInt(br.readLine());
        int max = 0;

        for (String pattern : map.keySet()) {
            int zeroCount = 0;
            for (char c : pattern.toCharArray()) {
                if (c == '0') zeroCount++;
            }

            if (zeroCount <= K && (K - zeroCount) % 2 == 0) {
                max = Math.max(max, map.get(pattern));
            }
        }

        System.out.println(max);
    }
}