import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] sequences = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            Map<String, Integer> map = new HashMap<>();

            for (String sequence : sequences) {
                map.put(sequence, 0);
            }

            for (int j = 0; j <= 37; j++) {
                String sub = input.substring(j, j + 3);
                map.put(sub, map.get(sub) + 1);
            }

            for (String sequence : sequences) {
                answer.append(map.get(sequence)).append(" ");
            }
            answer.append("\n");
        }

        System.out.print(answer);
    }
}