import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            int balance = Integer.parseInt(parts[0]);
            char transactionType = parts[1].charAt(0);
            int amount = Integer.parseInt(parts[2]);

            if (balance == 0 && transactionType == 'W' && amount == 0) {
                break;
            }

            if (transactionType == 'W') {
                if (balance - amount < -200) {
                    System.out.println("Not allowed");
                } else {
                    balance -= amount;
                    System.out.println(balance);
                }
            } else if (transactionType == 'D') {
                balance += amount;
                System.out.println(balance);
            }
        }

    }
}