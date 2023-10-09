import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        String answer = "";
        if (M < 2 || M == 2 && D < 18) {
            answer = "Before";
        } else if (M == 2 && D > 18 || M > 2) {
            answer = "After";
        } else if (M == 2 && D == 18) {
            answer = "Special";
        }
        System.out.println(answer);
    }
}
