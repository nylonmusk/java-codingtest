import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int F = -1 * (Integer.parseInt(br.readLine()) - Integer.parseInt(br.readLine()));
        if (1 <= F && F <= 20) {
            System.out.println("You are speeding and your fine is $100.");
        } else if (21 <= F && F <= 30) {
            System.out.println("You are speeding and your fine is $270.");
        } else if (31 <= F) {
            System.out.println("You are speeding and your fine is $500.");
        } else {
            System.out.println("Congratulations, you are within the speed limit!\n");
        }
    }
}


