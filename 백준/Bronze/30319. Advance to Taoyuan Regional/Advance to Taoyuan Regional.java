import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputDate = br.readLine();
        LocalDate tentativeDate = LocalDate.parse(inputDate, DateTimeFormatter.ISO_DATE);

        LocalDate contestDate = LocalDate.of(2023, 10, 21);

        LocalDate deadlineDate = contestDate.minusDays(35);

        if (tentativeDate.isBefore(deadlineDate) || tentativeDate.isEqual(deadlineDate)) {
            System.out.println("GOOD");
        } else {
            System.out.println("TOO LATE");
        }
    }
}