import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int H = Integer.parseInt(br.readLine());
        int W = Integer.parseInt(br.readLine());

        int minSide = Math.min(H, W);
        int radiusCm = (minSide * 100) / 2;

        System.out.println(radiusCm);
    }
}