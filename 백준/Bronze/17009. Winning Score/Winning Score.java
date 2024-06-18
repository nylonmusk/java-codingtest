import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = 0;
        A += 3 * Integer.parseInt(br.readLine());
        A += 2 * Integer.parseInt(br.readLine());
        A += 1 * Integer.parseInt(br.readLine());
        int B = 0;
        B += 3 * Integer.parseInt(br.readLine());
        B += 2 * Integer.parseInt(br.readLine());
        B += 1 * Integer.parseInt(br.readLine());

        if (A > B) System.out.println("A");
        if (A < B) System.out.println("B");
        if (A == B) System.out.println("T");
    }
}
