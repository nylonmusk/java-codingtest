import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int holeNumber = 1;

        while ((line = br.readLine()) != null) {
            String[] parts = line.trim().split(" ");
            int par = Integer.parseInt(parts[0]);
            int stroke = Integer.parseInt(parts[1]);

            if (par == 0) break;

            System.out.println("Hole #" + holeNumber);
            holeNumber++;

            if (stroke == 1) {
                System.out.println("Hole-in-one.\n");
            } else if (stroke <= par - 3) {
                System.out.println("Double eagle.\n");
            } else if (stroke == par - 2) {
                System.out.println("Eagle.\n");
            } else if (stroke == par - 1) {
                System.out.println("Birdie.\n");
            } else if (stroke == par) {
                System.out.println("Par.\n");
            } else if (stroke == par + 1) {
                System.out.println("Bogey.\n");
            } else {
                System.out.println("Double Bogey.\n");
            }
        }
    }
}