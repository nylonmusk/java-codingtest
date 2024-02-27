import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> heights = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            heights.add(Integer.parseInt(br.readLine()));
        }

        heights.sort(Comparator.comparingInt(a -> a));

        int sum = heights.stream().mapToInt(Integer::intValue).sum();

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                int totalWithoutTwo = sum - heights.get(i) - heights.get(j);
                if (totalWithoutTwo == 100) {
                    heights.remove(j);
                    heights.remove(i);
                }

                if (heights.size() == 7) break;
            }
            if (heights.size() == 7) break;
        }
        for (int height : heights) System.out.println(height);
    }
}
