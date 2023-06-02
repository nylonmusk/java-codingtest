import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ss = br.readLine();
        int count = 0;
        for (String s : ss.split(",")) {
            count++;
        }
        System.out.println(count);
    }
}