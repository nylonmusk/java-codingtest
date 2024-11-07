import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        String str = "SciComLove";
        int length = str.length();
        int rotation = N % length;

        System.out.println(str.substring(rotation) + str.substring(0, rotation));
    }
}