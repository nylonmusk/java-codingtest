import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (a.equals("0") && b.equals("0")) break;

            int carry = 0;
            int count = 0;
            int i = a.length() - 1;
            int j = b.length() - 1;

            while (i >= 0 || j >= 0) {
                int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
                int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

                if (digitA + digitB + carry >= 10) {
                    carry = 1;
                    count++;
                } else {
                    carry = 0;
                }
                i--;
                j--;
            }

            System.out.println(count);
        }
    }
}