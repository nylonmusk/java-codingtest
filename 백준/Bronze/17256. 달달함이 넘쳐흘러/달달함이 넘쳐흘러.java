import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stA = new StringTokenizer(br.readLine());
        int ax = Integer.parseInt(stA.nextToken());
        int ay = Integer.parseInt(stA.nextToken());
        int az = Integer.parseInt(stA.nextToken());

        StringTokenizer stC = new StringTokenizer(br.readLine());
        int cx = Integer.parseInt(stC.nextToken());
        int cy = Integer.parseInt(stC.nextToken());
        int cz = Integer.parseInt(stC.nextToken());

        int bx = cx - az;
        int by = cy / ay;
        int bz = cz - ax;

        System.out.println(bx + " " + by + " " + bz);
    }
}