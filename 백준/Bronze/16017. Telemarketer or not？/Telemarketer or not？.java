import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = Integer.parseInt(br.readLine());
        int fourth = Integer.parseInt(br.readLine());

        if ((first == 8 || first == 9) &&
                (fourth == 8 || fourth == 9) &&
                (second == third)) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }
    }
}