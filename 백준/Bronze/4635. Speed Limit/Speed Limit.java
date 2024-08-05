import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }

            int previousTime = 0;
            int totalDistance = 0;

            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                int speed = Integer.parseInt(input[0]);
                int elapsedTime = Integer.parseInt(input[1]);

                int timeDifference = elapsedTime - previousTime;
                totalDistance += speed * timeDifference;

                previousTime = elapsedTime;
            }

            System.out.println(totalDistance + " miles");
        }
    }
}