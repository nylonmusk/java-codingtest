import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int P = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        System.out.println(getAttackedDogs(P, A, B, C, D));
        System.out.println(getAttackedDogs(M, A, B, C, D));
        System.out.println(getAttackedDogs(N, A, B, C, D));
    }

    private static int getAttackedDogs(int time, int A, int B, int C, int D) {
        int dogsAttacked = 0;

        if (isDogAggressive(time, A, B)) dogsAttacked++;
        if (isDogAggressive(time, C, D)) dogsAttacked++;

        return dogsAttacked;
    }

    private static boolean isDogAggressive(int time, int aggressiveTime, int calmTime) {
        int cycle = aggressiveTime + calmTime;
        int remainder = time % cycle;
        return remainder > 0 && remainder <= aggressiveTime;
    }
}