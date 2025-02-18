import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        double diagonalCut = Math.sqrt(w * w + h * h);
        double rectangleCut = w + h;

        double answer = rectangleCut - diagonalCut;

        System.out.printf("%.6f\n", answer);
    }
}