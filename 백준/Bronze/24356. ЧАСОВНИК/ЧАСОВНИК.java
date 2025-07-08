import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int t1 = Integer.parseInt(input[0]);
        int m1 = Integer.parseInt(input[1]);
        int t2 = Integer.parseInt(input[2]);
        int m2 = Integer.parseInt(input[3]);

        int start = t1 * 60 + m1;
        int end = t2 * 60 + m2;

        if (end < start) {
            end += 24 * 60;
        }

        int totalMinutes = end - start;
        int fullLaps = totalMinutes / 30;

        System.out.println(totalMinutes + " " + fullLaps);
    }
}