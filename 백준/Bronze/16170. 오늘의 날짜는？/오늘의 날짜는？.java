import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(ZoneId.of("UTC"));

        System.out.println(date.getYear());
        System.out.println(String.format("%02d", date.getMonthValue()));
        System.out.println(String.format("%02d", date.getDayOfMonth()));
    }
}
