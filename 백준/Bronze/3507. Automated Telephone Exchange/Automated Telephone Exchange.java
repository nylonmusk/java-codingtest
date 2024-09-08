import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int second = 0; second <= 99; second++) {
            for (int third = 0; third <= 99; third++) {
                if (n - second - third == 0) {
                    answer++;
                }
            }
        }
        
        System.out.println(answer);
    }
}