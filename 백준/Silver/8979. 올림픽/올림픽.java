import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Medal implements Comparable<Medal> {
    int index, gold, silver, bronze;

    Medal(int index, int gold, int silver, int bronze) {
        this.index = index;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }

    @Override
    public int compareTo(Medal m) {
        if (this.gold != m.gold) {
            return m.gold - this.gold;
        } else if (this.silver != m.silver) {
            return m.silver - this.silver;
        } else {
            return m.bronze - this.bronze;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Medal> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Medal(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list);

        int answer = 1;
        for (int i = 0; i < N; i++) {
            if (i > 0 && !isSameRank(list.get(i), list.get(i - 1))) {
                answer = i + 1;
            }
            if (list.get(i).index == K) {
                System.out.println(answer);
                return;
            }
        }
    }

    private static boolean isSameRank(Medal m1, Medal m2) {
        return m1.gold == m2.gold && m1.silver == m2.silver && m1.bronze == m2.bronze;
    }
}
