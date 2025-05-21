import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int caseNum = 1;

        while (true) {
            line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            System.out.println("Triangle #" + caseNum);
            if (a == -1) {
                if (c <= b) {
                    System.out.println("Impossible.\n");
                } else {
                    double result = Math.sqrt(c * c - b * b);
                    System.out.printf("a = %.3f\n\n", result);
                }
            } else if (b == -1) {
                if (c <= a) {
                    System.out.println("Impossible.\n");
                } else {
                    double result = Math.sqrt(c * c - a * a);
                    System.out.printf("b = %.3f\n\n", result);
                }
            } else if (c == -1) {
                double result = Math.sqrt(a * a + b * b);
                System.out.printf("c = %.3f\n\n", result);
            }

            caseNum++;
        }
    }
}