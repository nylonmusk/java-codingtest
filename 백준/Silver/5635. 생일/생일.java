import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String minName = "";
        int minDay = 32, minMonth = 13, minYear = 2011;
        String maxName = "";
        int maxDay = 0, maxMonth = 0, maxYear = 1990;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            if (year < minYear || (year == minYear && month < minMonth)
                    || (year == minYear && month == minMonth && day < minDay)) {
                minName = name;
                minDay = day;
                minMonth = month;
                minYear = year;
            }

            if (year > maxYear || (year == maxYear && month > maxMonth)
                    || (year == maxYear && month == maxMonth && day > maxDay)) {
                maxName = name;
                maxDay = day;
                maxMonth = month;
                maxYear = year;
            }
        }

        System.out.println(maxName);
        System.out.println(minName);
    }
}
