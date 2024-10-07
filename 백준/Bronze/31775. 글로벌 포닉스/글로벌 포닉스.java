import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isL = false;
        boolean isK = false;
        boolean isP = false;
        
        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            char c = s.charAt(0);
            if (c == 'k') {
                isK = true;
            } else if (c == 'l') {
                isL = true;
            } else if (c == 'p') {
                isP = true;
            }
        }

        if (isK && isL && isP) {
            System.out.println("GLOBAL");
        } else {
            System.out.println("PONIX");
        }
    }
}