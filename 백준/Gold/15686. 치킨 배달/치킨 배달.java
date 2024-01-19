import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static int answer = Integer.MAX_VALUE;
    private static boolean[] isVisited;
    private static List<int[]> chickenStore;
    private static List<int[]> houses;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        chickenStore = new ArrayList<>();
        houses = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int info = Integer.parseInt(st.nextToken());
                if (info == 1) houses.add(new int[]{i, j});
                if (info == 2) chickenStore.add(new int[]{i, j});
            }
        }

        isVisited = new boolean[chickenStore.size()];
        backtracking(0, 0);
        
        System.out.println(answer);
    }

    private static void backtracking(int count, int index) {
        if (count == M) {
            int total = 0;
            for (int i = 0; i < houses.size(); i++) {
                int sum = Integer.MAX_VALUE;
                for (int j = 0; j < chickenStore.size(); j++) {
                    if (isVisited[j]) {
                        int distance = Math.abs(houses.get(i)[0] - chickenStore.get(j)[0]) + Math.abs(houses.get(i)[1] - chickenStore.get(j)[1]);
                        sum = Math.min(sum, distance);
                    }
                }
                total += sum;
            }
            answer = Math.min(answer, total);
            return;
        }

        for (int i = index; i < chickenStore.size(); i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                backtracking(count + 1, i + 1);
                isVisited[i] = false;
            }
        }
    }
}