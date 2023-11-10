import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        a = a.replaceAll(b, "*");

        int answer = 0;
        for (String s : a.split("")) {
            if (s.equals("*")) answer++;
        }
        System.out.println(answer);
    }
}
