import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double area = Double.parseDouble(st.nextToken());
            double base = Double.parseDouble(st.nextToken());
            double height = (2 * area) / base;
            sb.append(String.format("The height of the triangle is %.2f units\n", height));
        }
        System.out.print(sb);
    }
}