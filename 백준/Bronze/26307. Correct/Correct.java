import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] time = br.readLine().split(" ");
        int HH = Integer.parseInt(time[0]);
        int MM = Integer.parseInt(time[1]);

        int startHour = 9;
        int startMinute = 0;
        
        System.out.println((HH - startHour) * 60 + (MM - startMinute));
    }
}