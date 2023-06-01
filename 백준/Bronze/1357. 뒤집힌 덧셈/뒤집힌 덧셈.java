import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        StringBuilder sbX = new StringBuilder();
        while (X != 0) {
            sbX.append(X % 10);
            X /= 10;
        }
        X = Integer.parseInt(sbX.toString());
        StringBuilder sbY = new StringBuilder();
        while (Y != 0) {
            sbY.append(Y % 10);
            Y /= 10;
        }
        Y = Integer.parseInt(sbY.toString());
        int reverse = X + Y;
        StringBuilder sb = new StringBuilder();

        while (reverse != 0) {
            sb.append(reverse % 10);
            reverse /= 10;
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}