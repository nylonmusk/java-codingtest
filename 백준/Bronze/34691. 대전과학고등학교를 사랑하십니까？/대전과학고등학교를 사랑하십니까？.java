import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (true) {
            input = br.readLine();
            if (input.equals("end")) break;

            if (input.equals("animal")) {
                System.out.println("Panthera tigris");
            } else if (input.equals("tree")) {
                System.out.println("Pinus densiflora");
            } else if (input.equals("flower")) {
                System.out.println("Forsythia koreana");
            }
        }
    }
}