import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());

        int nikkyCycle = a + b;
        int nikkyFullCycles = s / nikkyCycle;
        int nikkyRemainder = s % nikkyCycle;
        int nikkyDistance = nikkyFullCycles * (a - b) + Math.min(nikkyRemainder, a);

        int byronCycle = c + d;
        int byronFullCycles = s / byronCycle;
        int byronRemainder = s % byronCycle;
        int byronDistance = byronFullCycles * (c - d) + Math.min(byronRemainder, c);

        if (nikkyDistance > byronDistance) {
            System.out.println("Nikky");
        } else if (nikkyDistance < byronDistance) {
            System.out.println("Byron");
        } else {
            System.out.println("Tied");
        }
    }
}