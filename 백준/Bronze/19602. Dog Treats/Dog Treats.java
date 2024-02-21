import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int smallTreats = Integer.parseInt(br.readLine());
        int mediumTreats = Integer.parseInt(br.readLine());
        int largeTreats = Integer.parseInt(br.readLine());

        int happinessScore = (1 * smallTreats) + (2 * mediumTreats) + (3 * largeTreats);

        if (happinessScore >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
