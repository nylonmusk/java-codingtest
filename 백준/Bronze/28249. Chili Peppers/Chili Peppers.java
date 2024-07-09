import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> pepperSHUMap = new HashMap<>();
        pepperSHUMap.put("Poblano", 1500);
        pepperSHUMap.put("Mirasol", 6000);
        pepperSHUMap.put("Serrano", 15500);
        pepperSHUMap.put("Cayenne", 40000);
        pepperSHUMap.put("Thai", 75000);
        pepperSHUMap.put("Habanero", 125000);

        int answer = 0;

        for (int i = 0; i < N; i++) {
            answer += pepperSHUMap.get(br.readLine());
        }

        System.out.println(answer);
    }
}