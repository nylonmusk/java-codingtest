import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder answer = new StringBuilder();
        for (char c : a.toCharArray()) {
            answer.append(c).append("\n");
        }
        System.out.println(answer.toString());
    }
}