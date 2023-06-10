import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 5;
        int sum = 0;
        while (i-- > 0) {
            sum += Integer.parseInt(br.readLine());
        }
        System.out.println(sum);
    }
}
