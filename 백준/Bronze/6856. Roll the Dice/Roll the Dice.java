import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= m; i++) {
            int j = 10 - i;
            if (j >= 1 && j <= n) count++;
        }

        if (count == 1)
            System.out.println("There is 1 way to get the sum 10.");
        else
            System.out.println("There are " + count + " ways to get the sum 10.");
    }
}