import java.io.*;
import java.util.*;

public class Main {
    private static int N, M;
    private static int[] pos;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine().trim());
        M = Integer.parseInt(br.readLine().trim());
        pos = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) pos[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(pos);

        int low = 0;
        int high = N;
        while (low < high) {
            int mid = (low + high) / 2;
            if (canCover(mid)) high = mid;
            else low = mid + 1;
        }
        System.out.println(low);
    }

    private static boolean canCover(int H) {
        int covered = 0;
        for (int i = 0; i < M; i++) {
            int left = pos[i] - H;
            int right = pos[i] + H;
            if (left > covered) {
                return false;
            }
            if (right > covered) {
                covered = right;
            }
            if (covered >= N) {
                return true;
            }
        }
        return covered >= N;
    }
}