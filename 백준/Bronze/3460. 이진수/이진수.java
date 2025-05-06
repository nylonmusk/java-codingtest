import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int index = 0;
            StringBuilder sb = new StringBuilder();

            while (n > 0) {
                if ((n & 1) == 1) {
                    sb.append(index).append(" ");
                }
                n >>= 1;
                index++;
            }
            System.out.println(sb.toString().trim());
        }
    }
}