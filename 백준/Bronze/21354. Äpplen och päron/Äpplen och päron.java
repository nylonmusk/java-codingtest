import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int axelEarned = A * 7;
        int petraEarned = P * 13;

        if (axelEarned > petraEarned) {
            System.out.println("Axel");
        } else if (axelEarned < petraEarned) {
            System.out.println("Petra");
        } else {
            System.out.println("lika");
        }
    }
}