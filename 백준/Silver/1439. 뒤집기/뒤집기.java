import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int i = 0;
        int countZero = 0;
        int countOne = 0;
        while (true) {
            if (i >= S.length()) {
                break;
            }
            if (i < S.length() && S.charAt(i) == '0') {
                while (i < S.length() && S.charAt(i) == '0') {
                    i++;
                }
                countZero++;
            }
            if (i < S.length() && S.charAt(i) == '1') {
                while (i < S.length() && S.charAt(i) == '1') {
                    i++;
                }
                countOne++;
            }
        }
        System.out.println(Math.min(countOne, countZero));
    }
}