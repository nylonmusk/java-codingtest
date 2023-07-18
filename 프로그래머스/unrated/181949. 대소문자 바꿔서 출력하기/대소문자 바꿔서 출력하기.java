import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (65 <= a.charAt(i) && a.charAt(i) <= 90) {
                answer.append((char)(a.charAt(i) + 32));        
            } else {
                answer.append((char)(a.charAt(i) - 32));        
            }
        }
        System.out.println(answer);
    }
}