import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sets = Integer.parseInt(br.readLine());

        for (int i = 0; i < sets; i++) {
            String[] input = br.readLine().split(" ");
            int size = Integer.parseInt(input[0]);
            char letter = input[1].charAt(0);

            for (int row = 0; row < size; row++) {
                char currentChar = (char) ((letter - 'A' + row) % 26 + 'A');

                for (int j = 0; j <= row; j++) {
                    System.out.print(currentChar);
                }
                System.out.println();
            }

            if (i < sets - 1) {
                System.out.println();
            }
        }
    }
}