import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final double MAX = 1001;
        final double MIN = -1001;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            double minX = MAX, maxX = MIN;
            double minY = MAX, maxY = MIN;

            for (int n = 0; n < N; n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                double X = Double.parseDouble(st.nextToken());
                double Y = Double.parseDouble(st.nextToken());

                minX = Math.min(minX, X);
                maxX = Math.max(maxX, X);
                minY = Math.min(minY, Y);
                maxY = Math.max(maxY, Y);
            }

            double area = Math.abs((maxX - minX) * (maxY - minY));
            double perimeter = Math.abs((maxX - minX) + (maxY - minY)) * 2;

            System.out.printf("Case %d: Area %.9f, Perimeter %.9f\n", t, area, perimeter);
        }
    }
}