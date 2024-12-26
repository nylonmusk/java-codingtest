import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private static final Map<String, Integer> DOT_DISCOUNTS;

    static {
        Map<String, Integer> tempMap = new HashMap<>();
        tempMap.put("R", 45);
        tempMap.put("G", 30);
        tempMap.put("B", 20);
        tempMap.put("Y", 15);
        tempMap.put("O", 10);
        tempMap.put("W", 5);
        DOT_DISCOUNTS = Collections.unmodifiableMap(tempMap);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double originalPrice = Double.parseDouble(st.nextToken());
            String color = st.nextToken();
            String coupon = st.nextToken();
            String payment = st.nextToken();

            double answer = calculatePrice(originalPrice, color, coupon, payment);
            System.out.printf("$%.2f\n", answer);
        }
    }

    private static double calculatePrice(double price, String color, String coupon, String payment) {
        price -= price * DOT_DISCOUNTS.getOrDefault(color, 0) / 100.0;

        if ("C".equals(coupon)) {
            price -= price * 5 / 100.0;
        }

        price = Math.round(price * 100) / 100.0;

        if ("C".equals(payment)) {
            int secondDecimal = (int) (price * 100 % 10);
            if (secondDecimal >= 6) {
                price = Math.round(price);
            } else {
                price = Math.floor(price * 10) / 10.0;
            }
        }

        return price;
    }
}