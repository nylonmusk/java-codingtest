import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int V = Integer.parseInt(br.readLine());
            Map<Integer, Integer> countMap = new HashMap<>();
            
            for (int j = 0; j < V; j++) {
                int num = Integer.parseInt(br.readLine());
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            int maxCount = 0;
            int answer = 1001;

            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                int num = entry.getKey();
                int count = entry.getValue();

                if (count > maxCount || (count == maxCount && num < answer)) {
                    maxCount = count;
                    answer = num;
                }
            }

            System.out.println(answer);
        }
    }
}