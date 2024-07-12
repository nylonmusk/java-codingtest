import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] sides = {a, b, c};
        Arrays.sort(sides);

        if (sides[0] + sides[1] > sides[2]) {
            System.out.println(sides[0] + sides[1] + sides[2]);
        } else {
            System.out.println((sides[0] + sides[1]) * 2 - 1);
        }
    }
}