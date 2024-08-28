import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = null;
        while (!(s = br.readLine()).equals("***")) {
            System.out.println(reverse(s));
        }
    }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}