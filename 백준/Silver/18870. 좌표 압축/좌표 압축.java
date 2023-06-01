import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        Collections.sort(list);
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(list.get(i))) {
                map.put(list.get(i), count++);
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(map.get(list2.get(i))).append(" ");
        }
        System.out.println(sb);
    }
}