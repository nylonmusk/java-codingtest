import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = br.readLine()).equals("*")) {
            String[] measures = line.split("/");
            int answer = 0;

            for (String measure : measures) {
                if (calculateDuration(measure) == 1.0) {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }

    private static double calculateDuration(String measure) {
        double duration = 0.0;
        for (char note : measure.toCharArray()) {
            switch (note) {
                case 'W': duration += 1.0; break;
                case 'H': duration += 0.5; break;
                case 'Q': duration += 0.25; break;
                case 'E': duration += 0.125; break;
                case 'S': duration += 0.0625; break;
                case 'T': duration += 0.03125; break;
                case 'X': duration += 0.015625; break;
            }
        }
        return duration;
    }
}