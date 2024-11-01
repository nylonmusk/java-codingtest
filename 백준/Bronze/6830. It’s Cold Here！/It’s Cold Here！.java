import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String coldestCity = "";
        int coldestTemperature = Integer.MAX_VALUE;

        while (true) {
            String line = reader.readLine();
            StringTokenizer st = new StringTokenizer(line);
            String city = st.nextToken();
            int temperature = Integer.parseInt(st.nextToken());

            if (temperature < coldestTemperature) {
                coldestTemperature = temperature;
                coldestCity = city;
            }

            if (city.equals("Waterloo")) {
                break;
            }
        }

        System.out.println(coldestCity);
    }
}