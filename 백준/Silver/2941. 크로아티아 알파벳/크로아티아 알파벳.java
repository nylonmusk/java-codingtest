import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(word.replaceAll("c=", "0")
                .replaceAll("c-", "0")
                .replaceAll("dz=", "0")
                .replaceAll("d-", "0")
                .replaceAll("lj", "0")
                .replaceAll("nj", "0")
                .replaceAll("s=", "0")
                .replaceAll("z=", "0").length());
    }
}