import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String[] input = br.readLine().split(" ");
            int[] sides = new int[3];
            for (int j = 0; j < 3; j++) {
                sides[j] = Integer.parseInt(input[j]);
            }

            Arrays.sort(sides);
            int a = sides[0];
            int b = sides[1];
            int c = sides[2];

            System.out.println("Scenario #" + i + ":");
            if (a * a + b * b == c * c) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            if (i < n) {
                System.out.println();
            }
        }
    }
}
