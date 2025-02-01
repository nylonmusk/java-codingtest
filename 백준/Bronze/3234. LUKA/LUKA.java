import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(br.readLine());
        String path = br.readLine();

        Set<String> set = new HashSet<>();
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                set.add((X + dx) + "," + (Y + dy));
            }
        }

        List<Integer> times = new ArrayList<>();
        int cx = 0, cy = 0;

        for (int i = 0; i < K; i++) {
            if (set.contains(cx + "," + cy)) {
                times.add(i);
            }

            char move = path.charAt(i);
            if (move == 'I') {
                cx++;
            } else if (move == 'S') {
                cy++;
            } else if (move == 'Z') {
                cx--;
            } else if (move == 'J') {
                cy--;
            }
        }

        if (set.contains(cx + "," + cy)) {
            times.add(K);
        }

        if (times.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int answer : times) {
                System.out.println(answer);
            }
        }
    }
}