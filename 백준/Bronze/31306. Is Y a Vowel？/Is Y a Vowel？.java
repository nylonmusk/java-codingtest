import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();
        int originLength = s.length();
        s = s.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "");


        int withoutY = originLength - s.length();
        int withY = originLength - s.replaceAll("y", "").length();


        System.out.println(withoutY + " " + withY);
    }
}
