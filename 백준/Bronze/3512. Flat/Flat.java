import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int costPerSqMeter = Integer.parseInt(firstLine[1]);

        int totalArea = 0;
        int bedroomArea = 0;
        double reducedTotalArea = 0;

        for (int i = 0; i < n; i++) {
            String[] roomInfo = br.readLine().split(" ");
            int area = Integer.parseInt(roomInfo[0]);
            String type = roomInfo[1];

            totalArea += area;
            if (type.equals("bedroom")) {
                bedroomArea += area;
            }

            if (type.equals("balcony")) {
                reducedTotalArea += area * 0.5;
            } else {
                reducedTotalArea += area;
            }
        }

        double flatCost = reducedTotalArea * costPerSqMeter;

        System.out.println(totalArea);
        System.out.println(bedroomArea);
        System.out.printf("%.6f\n", flatCost);
    }
}