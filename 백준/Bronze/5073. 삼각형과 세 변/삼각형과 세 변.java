import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (isValidTriangle(a, b, c)) {
                System.out.println(getTriangleType(a, b, c));
            } else {
                System.out.println("Invalid");
            }
        }
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && c + a > b;
    }

    private static String getTriangleType(int a, int b, int c) {
        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || c == a) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
