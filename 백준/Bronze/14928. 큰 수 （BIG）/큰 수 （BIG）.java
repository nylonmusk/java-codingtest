import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        long temp = 0;
        for (int i = 0; i < input.length(); i++) {
        	temp = (temp * 10 + (input.charAt(i) - '0')) % 20000303;
        }
        
        System.out.println(temp);
    }
}
