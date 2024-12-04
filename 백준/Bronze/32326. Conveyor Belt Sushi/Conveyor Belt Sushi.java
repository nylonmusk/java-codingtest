import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int R = Integer.parseInt(br.readLine());
        int G = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        System.out.println(R * 3 + G * 4 + B * 5);
    }
}