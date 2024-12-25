import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lion = 0;
        int tiger = 0;

        for (int i = 0; i < 9; i++) {
            if (br.readLine().equals("Lion")) {
                lion++;
            } else {
                tiger++;
            }
        }

        System.out.println(lion > tiger ? "Lion" : "Tiger");
    }
}