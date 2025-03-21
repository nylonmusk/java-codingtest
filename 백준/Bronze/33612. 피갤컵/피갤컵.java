import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int startYear = 2024;
        int startMonth = 8;
        int monthsToAdd = (N - 1) * 7;

        int year = startYear + (startMonth + monthsToAdd - 1) / 12;
        int month = (startMonth + monthsToAdd - 1) % 12 + 1;

        System.out.println(year + " " + month);
    }
}