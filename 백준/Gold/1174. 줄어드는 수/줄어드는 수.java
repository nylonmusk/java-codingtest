import java.io.*;
import java.util.*;

public class Main {
    private static List<Long> list = new ArrayList<>();

    private static void dfs(long num, int last) {
        list.add(num);
        for (int d = 0; d < last; d++) {
            dfs(num * 10 + d, d);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        for (int d = 0; d <= 9; d++) {
            dfs(d, d);
        }

        Collections.sort(list);

        if (N > list.size()) {
            System.out.println(-1);
        } else {
            System.out.println(list.get(N - 1));
        }
    }
}