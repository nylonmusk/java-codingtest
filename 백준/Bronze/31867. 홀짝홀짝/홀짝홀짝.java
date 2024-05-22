import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String K = br.readLine();

        int countPlus = 0;
        int countMinus = 0;

        for (int i = 0; i < N; i++) {
            char digit = K.charAt(i);
            if (digit % 2 == 0) {
                countPlus++;
            } else {
                countMinus++;
            }
        }

        if (countPlus > countMinus) {
            System.out.println(0);
        } else if (countPlus < countMinus) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
