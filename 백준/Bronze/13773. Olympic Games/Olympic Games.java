import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringBuilder answer = new StringBuilder();

        while (!(s = br.readLine()).equals("0")) {
            int year = Integer.parseInt(s);

            if (year < 1896 || (year - 1896) % 4 != 0) {
                answer.append(year).append(" No summer games\n");
            } else if ((year >= 1914 && year <= 1918) || (year >= 1939 && year <= 1945)) {
                answer.append(year).append(" Games cancelled\n");
            } else if (year > 2020) {
                answer.append(year).append(" No city yet chosen\n");
            } else {
                answer.append(year).append(" Summer Olympics\n");
            }
        }

        System.out.print(answer);
    }
}