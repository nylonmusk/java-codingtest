import java.io.*;
import java.util.*;

public class Main {
    static class Num {
        int value;
        int freq;
        int order;
        Num(int value, int freq, int order) {
            this.value = value;
            this.freq = freq;
            this.order = order;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        Map<Integer, Num> map = new LinkedHashMap<>();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (map.containsKey(x)) {
                map.get(x).freq++;
            } else {
                map.put(x, new Num(x, 1, i));
            }
        }

        List<Num> list = new ArrayList<>(map.values());
        list.sort((a, b) -> {
            if (a.freq != b.freq) return b.freq - a.freq;
            return a.order - b.order;
        });

        StringBuilder sb = new StringBuilder();
        for (Num n : list) {
            for (int i = 0; i < n.freq; i++) {
                sb.append(n.value).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}