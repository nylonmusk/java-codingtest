import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> books = new HashMap<>();
        while (N-- > 0) {
            String book = br.readLine();
            books.put(book, books.getOrDefault(book, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (String s : books.keySet()) {
            max = Math.max(max, books.get(s));
        }

        List<String> keySet = new ArrayList<>(books.keySet());
        Collections.sort(keySet);

        for (String s : keySet) {
            if (books.get(s) == max) {
                System.out.println(s);
                break;
            }
        }
    }
}
