import java.beans.BeanInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<BigInteger, Integer> cards = new HashMap<>();
        while (N-- > 0) {
            BigInteger card = new BigInteger(br.readLine());
            cards.put(card, cards.getOrDefault(card, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (BigInteger i : cards.keySet()) {
            max = Math.max(max, cards.get(i));
        }

        List<BigInteger> keySet = new ArrayList<>(cards.keySet());
        Collections.sort(keySet);

        for (BigInteger i : keySet) {
            if (cards.get(i) == max) {
                System.out.println(i);
                break;
            }
        }
    }
}
