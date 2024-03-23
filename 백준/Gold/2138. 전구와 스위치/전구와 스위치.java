import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static final int INF = Integer.MAX_VALUE;
    static int[] chooseFirst, notChooseFirst, target;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        char[] lights = br.readLine().toCharArray();
        chooseFirst = new int[N];
        notChooseFirst = new int[N];
        target = new int[N];

        for (int i = 0; i < N; i++) {
            chooseFirst[i] = lights[i] - '0';
            notChooseFirst[i] = lights[i] - '0';
        }

        lights = br.readLine().toCharArray();
        for (int i = 0; i < N; i++) {
            target[i] = lights[i] - '0';
        }

        chooseFirst[0] ^= 1;
        chooseFirst[1] ^= 1;

        int answer = INF;
        int countFirst = simulation(chooseFirst) + 1;
        int countSecond = simulation(notChooseFirst);

        if (isSame(chooseFirst)) answer = countFirst;
        if (isSame(notChooseFirst)) answer = Math.min(answer, countSecond);

        System.out.println(answer == INF ? -1 : answer);
    }

    private static int simulation(int[] lights) {
        int count = 0;
        for (int i = 1; i < N; i++) {
            if (lights[i - 1] != target[i - 1]) {
                lights[i - 1] ^= 1;
                lights[i] ^= 1;
                if (i + 1 < N) lights[i + 1] ^= 1;
                count++;
            }
        }
        return count;
    }

    private static boolean isSame(int[] lights) {
        for (int i = 0; i < N; i++) {
            if (lights[i] != target[i]) return false;
        }
        return true;
    }
}