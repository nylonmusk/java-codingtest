import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int tripNumber = 1;

        while ((s = br.readLine()) != null) {
            String[] data = s.split(" ");
            double diameter = Double.parseDouble(data[0]);
            int revolutions = Integer.parseInt(data[1]);
            double time = Double.parseDouble(data[2]);

            if (revolutions == 0) break;

            double distance = Math.PI * diameter * revolutions / 12 / 5280;

            double mph = distance / (time / 3600);

            System.out.printf("Trip #%d: %.2f %.2f%n", tripNumber, distance, mph);
            tripNumber++;
        }
    }
}