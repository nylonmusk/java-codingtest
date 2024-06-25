import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();

        int totalBottles = e + f;
        int totalDrinks = 0;

        while (totalBottles >= c) {
            int newDrinks = totalBottles / c;
            totalDrinks += newDrinks;
            totalBottles = totalBottles % c + newDrinks;
        }

        System.out.println(totalDrinks);

        sc.close();
    }
}
