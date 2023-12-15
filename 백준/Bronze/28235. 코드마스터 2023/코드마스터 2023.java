import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String answer = "";
        if (s.equals("SONGDO")) {
            answer = "HIGHSCHOOL";
        } else if (s.equals("CODE")) {
            answer = "MASTER";
        } else if (s.equals("2023")) {
            answer = "0611";
        } else {
            answer = "CONTEST";
        }
        System.out.println(answer);
    }
}
