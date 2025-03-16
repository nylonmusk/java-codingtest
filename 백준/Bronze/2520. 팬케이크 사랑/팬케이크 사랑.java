import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            br.readLine();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int cm = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int ssu = Integer.parseInt(st.nextToken());
            int ssa = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int gs = Integer.parseInt(st.nextToken());
            int gc = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            int maxBatter = (int) Math.floor(Math.min(
                    Math.min((double) cm / 8, (double) y / 8),
                    Math.min((double) ssu / 4, Math.min((double) ssa / 1, (double) f / 9))) * 16);

            int bananaPancake = b;
            int strawberryPancake = gs / 30;
            int chocolatePancake = gc / 25;
            int walnutPancake = w / 10;

            int result = Math.min(maxBatter, bananaPancake + strawberryPancake + chocolatePancake + walnutPancake);

            System.out.println(result);
        }
    }
}