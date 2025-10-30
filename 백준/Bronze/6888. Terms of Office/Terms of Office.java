import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        
        for (int year = X; year <= Y; year++) {
            if ((year - X) % 60 == 0) {
                System.out.println("All positions change in year " + year);
            }
        }
    }
}