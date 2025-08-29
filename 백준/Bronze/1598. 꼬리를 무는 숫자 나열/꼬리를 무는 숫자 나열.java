import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int rowA = (a - 1) % 4;
        int colA = (a - 1) / 4;
        int rowB = (b - 1) % 4;
        int colB = (b - 1) / 4;

        int distance = Math.abs(rowA - rowB) + Math.abs(colA - colB);
        System.out.println(distance);
    }
}