import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class IceCream {
    int B;
    long C;

    IceCream(int B, long C) {
        this.B = B;
        this.C = C;
    }
}

public class Main {
    static List<List<IceCream>> iceCreams = new ArrayList<>();
    static boolean[] isVisited;
    static long answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        isVisited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            iceCreams.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            long C = Long.parseLong(st.nextToken());

            iceCreams.get(A).add(new IceCream(B, C));
            iceCreams.get(B).add(new IceCream(A, C));
        }

        dfs(1, 0);
        System.out.println(answer);
    }

    private static void dfs(int now, long distance) {
        isVisited[now] = true;

        for (IceCream iceCream : iceCreams.get(now)) {
            int nextRoom = iceCream.B;
            long nextDistance = distance + iceCream.C;

            if (!isVisited[nextRoom]) {
                dfs(nextRoom, nextDistance);
            }
        }

        if (distance > answer) {
            answer = distance;
        }
    }
}
