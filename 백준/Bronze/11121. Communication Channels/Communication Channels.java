import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] transmission = br.readLine().split(" ");
            String input = transmission[0];
            String output = transmission[1];

            if (input.equals(output)) {
                System.out.println("OK");
            } else {
                System.out.println("ERROR");
            }
        }
    }
}
