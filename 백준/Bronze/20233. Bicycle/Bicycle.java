import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        int extraMinutesFirst = Math.max(0, T - 30);
        int extraMinutesSecond = Math.max(0, T - 45);

        int costFirst = a + extraMinutesFirst * x * 21;
        int costSecond = b + extraMinutesSecond * y * 21;

        System.out.println(costFirst + " " + costSecond);
    }
}