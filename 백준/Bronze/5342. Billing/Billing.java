import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Double> priceMap = new HashMap<>();
        priceMap.put("Paper", 57.99);
        priceMap.put("Printer", 120.50);
        priceMap.put("Planners", 31.25);
        priceMap.put("Binders", 22.50);
        priceMap.put("Calendar", 10.95);
        priceMap.put("Notebooks", 11.20);
        priceMap.put("Ink", 66.95);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        double answer = 0.0;

        while (!(input = br.readLine()).equals("EOI")) {
            if (priceMap.containsKey(input)) {
                answer += priceMap.get(input);
            }
        }

        System.out.printf("$%.2f\n", answer);
    }
}