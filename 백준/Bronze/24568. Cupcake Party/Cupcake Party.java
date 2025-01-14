import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        
        int totalCupcakes = R * 8 + S * 3;
        int leftover = totalCupcakes - 28;
        
        System.out.println(leftover);
    }
}