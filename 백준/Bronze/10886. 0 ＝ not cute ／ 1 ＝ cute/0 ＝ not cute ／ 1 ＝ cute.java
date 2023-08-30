import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cute = 0;
        int notCute = 0;
        while (N-- > 0) {
            if (br.readLine().equals("1")) {
                cute++;
            } else {
                notCute++;
            }
        }
        System.out.println(cute > notCute ? "Junhee is cute!" : "Junhee is not cute!");
    }
}

