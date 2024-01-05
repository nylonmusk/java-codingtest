import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cupCount = 3;
        int[] cups = new int[cupCount];

        for (int i = 0; i < cupCount; i++) {
            cups[i] = i + 1;
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int X = Integer.parseInt(input[0]) - 1;
            int Y = Integer.parseInt(input[1]) - 1;

            int temp = cups[X];
            cups[X] = cups[Y];
            cups[Y] = temp;
        }

        int ballPosition = -1;
        for (int i = 0; i < cupCount; i++) {
            if (cups[i] == 1) {
                ballPosition = i + 1;
                break;
            }
        }

        System.out.println(ballPosition);
    }
}
