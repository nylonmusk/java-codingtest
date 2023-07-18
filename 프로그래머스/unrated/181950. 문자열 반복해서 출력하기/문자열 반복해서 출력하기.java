import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        StringBuilder answer = new StringBuilder();
        answer.append(str.repeat(n));
        System.out.println(answer);
    }
}