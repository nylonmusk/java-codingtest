import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Set<Integer> setA = new HashSet<>();
        while (A-- > 0) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        Set<Integer> setB = new HashSet<>();
        while (B-- > 0) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> list = new ArrayList<>(setA);
        Collections.sort(list);
        int count = 0;
        for (int i : list) {
            if (!setB.contains(i)) {
                sb.append(i).append(" ");
                count++;
            }
        }
        System.out.println(count);
        System.out.println(sb);
    }
}
