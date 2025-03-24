import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A1 = Integer.parseInt(br.readLine());
        int A2 = Integer.parseInt(br.readLine());
        int A3 = Integer.parseInt(br.readLine());

        int time1 = A2 * 2 + A3 * 4;
        int time2 = A1 * 2 + A3 * 2;
        int time3 = A1 * 4 + A2 * 2;

        System.out.println(Math.min(time1, Math.min(time2, time3)));
    }
}