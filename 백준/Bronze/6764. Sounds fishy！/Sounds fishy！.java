import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] depthReadings = new int[4];
        for (int i = 0; i < 4; i++) {
            depthReadings[i] = Integer.parseInt(br.readLine());
        }

        if (depthReadings[0] < depthReadings[1] && depthReadings[1] < depthReadings[2] && depthReadings[2] < depthReadings[3]) {
            System.out.println("Fish Rising");
        } else if (depthReadings[0] > depthReadings[1] && depthReadings[1] > depthReadings[2] && depthReadings[2] > depthReadings[3]) {
            System.out.println("Fish Diving");
        } else if (depthReadings[0] == depthReadings[1] && depthReadings[1] == depthReadings[2] && depthReadings[2] == depthReadings[3]) {
            System.out.println("Fish At Constant Depth");
        } else {
            System.out.println("No Fish");
        }
    }
}
