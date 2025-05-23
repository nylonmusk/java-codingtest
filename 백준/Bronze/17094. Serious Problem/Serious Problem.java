import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        String s = br.readLine();

        int count2 = 0;
        int countE = 0;

        for (char c : s.toCharArray()) {
            if (c == '2') {
                count2++;
            } else if (c == 'e') {
                countE++;
            }
        }

        if (count2 > countE) {
            System.out.println("2");
        } else if (count2 < countE) {
            System.out.println("e");
        } else {
            System.out.println("yee");
        }
    }
}