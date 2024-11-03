import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String a = input[0];
        String b = input[1];

        int aLen = a.length();
        int bLen = b.length();

        int aCross = -1, bCross = -1;
        outerLoop:
        for (int i = 0; i < aLen; i++) {
            for (int j = 0; j < bLen; j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    aCross = i;
                    bCross = j;
                    break outerLoop;
                }
            }
        }

        for (int i = 0; i < bLen; i++) {
            if (i == bCross) {
                System.out.println(a);
            } else {
                for (int j = 0; j < aLen; j++) {
                    if (j == aCross) {
                        System.out.print(b.charAt(i));
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
        }
    }
}