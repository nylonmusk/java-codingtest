import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt((br.readLine()));
        List<String> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String lastName = br.readLine().substring(0, 1);
            map.put(lastName, map.getOrDefault(lastName, 0) + 1);
            if (map.get(lastName) >= 5 && !answer.contains(lastName)) {
                answer.add(lastName);
            }
        }

        if (!answer.isEmpty()) {
            Collections.sort(answer);
            System.out.println(answer.toString()
                    .replaceAll("\\[", "")
                    .replaceAll("\\]", "")
                    .replaceAll(", ", ""));
        } else {
            System.out.println("PREDAJA");
        }

    }
}