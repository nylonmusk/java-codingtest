import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("add")) {
                set.add(Integer.parseInt(st.nextToken()));
            }
            if (command.equals("remove")) {
                set.remove(Integer.parseInt(st.nextToken()));
            }
            if (command.equals("check")) {
                if (set.contains(Integer.parseInt(st.nextToken()))) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            if (command.equals("toggle")) {
                int i = Integer.parseInt(st.nextToken());
                if (set.contains(i)) {
                    set.remove(i);
                } else {
                    set.add(i);
                }
            }
            if (command.equals("all")) {
                for (int i = 1; i <= 20; i++) {
                    set.add(i);
                }
            }
            if (command.equals("empty")) {
                set.clear();
            }
        }
        System.out.println(sb);
    }
}
