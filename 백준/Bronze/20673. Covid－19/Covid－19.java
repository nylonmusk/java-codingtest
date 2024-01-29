import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(br.readLine());
        int q = Integer.parseInt(br.readLine());

        System.out.println(getColorCode(p, q));
    }

    private static String getColorCode(int newCases, int newHospitalizations) {
        if (newHospitalizations > 30) {
            return "Red";
        } else if (newCases <= 50 && newHospitalizations <= 10) {
            return "White";
        } else {
            return "Yellow";
        }
    }
}
