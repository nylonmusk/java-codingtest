import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int size = Integer.parseInt(br.readLine());

            printJBox(size);

            if (i < T - 1) {
                System.out.println();
            }
        }
    }

    public static void printJBox(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("#");
        }
        System.out.println();

        for (int i = 0; i < size - 2; i++) {
            System.out.print("#");
            for (int j = 0; j < size - 2; j++) {
                System.out.print("J");
            }
            System.out.println("#");
        }

        if (size > 1) {
            for (int i = 0; i < size; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}