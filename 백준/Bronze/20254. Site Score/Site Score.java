import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int UR = scanner.nextInt();
        int TR = scanner.nextInt();
        int UO = scanner.nextInt();
        int TO = scanner.nextInt();
        
        System.out.println(56 * UR + 24 * TR + 14 * UO + 6 * TO);
    }
}
