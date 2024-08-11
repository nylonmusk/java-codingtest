import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> matchsticks = new HashMap<>();
        matchsticks.put(0, 6);
        matchsticks.put(1, 2);
        matchsticks.put(2, 5);
        matchsticks.put(3, 5);
        matchsticks.put(4, 4);
        matchsticks.put(5, 5);
        matchsticks.put(6, 6);
        matchsticks.put(7, 3);
        matchsticks.put(8, 7);
        matchsticks.put(9, 6);

        int N = Integer.parseInt(br.readLine());

        System.out.println(findEquation(N, matchsticks));
    }

    public static String findEquation(int N, Map<Integer, Integer> matchsticks) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                int k = i + j;

                if (k < 100) {
                    int totalMatchsticks = countMatchsticks(i, matchsticks)
                            + countMatchsticks(j, matchsticks)
                            + countMatchsticks(k, matchsticks)
                            + 4;

                    if (totalMatchsticks == N) {
                        return String.format("%02d+%02d=%02d", i, j, k);
                    }
                }
            }
        }

        return "impossible";
    }

    public static int countMatchsticks(int number, Map<Integer, Integer> matchsticks) {
        int tens = number / 10;
        int units = number % 10;

        return matchsticks.get(tens) + matchsticks.get(units);
    }
}