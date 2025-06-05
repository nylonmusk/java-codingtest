import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String A = br.readLine().replaceAll(" ", "");
        String B = br.readLine().replaceAll(" ", "");

        long numA = Long.parseLong(A);
        long numB = Long.parseLong(B);

        System.out.println(Math.min(numA, numB));
    }
}