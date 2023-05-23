import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);
            int[] point = {x, y};
            list.add(point);
        }

        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                if (p1[1] == p2[1]) {
                    return Integer.compare(p1[0], p2[0]);
                }
                return Integer.compare(p1[1], p2[1]);
            }
        });

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)[0] + " " + list.get(i)[1]).append("\n");
        }
        System.out.println(sb);
    }
}