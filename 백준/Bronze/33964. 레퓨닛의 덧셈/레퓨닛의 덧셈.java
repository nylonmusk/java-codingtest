import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().trim().split("\\s+");
        int X = Integer.parseInt(parts[0]);
        int Y = Integer.parseInt(parts[1]);

        StringBuilder a = new StringBuilder();
        for (int i = 0; i < X; i++) a.append('1');
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < Y; i++) b.append('1');

        BigInteger A = new BigInteger(a.toString());
        BigInteger B = new BigInteger(b.toString());
        System.out.println(A.add(B));
    }
}