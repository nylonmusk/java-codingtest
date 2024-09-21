import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] names = {"", "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};
        String[] sameNames = {"", "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh"};

        for (int i = 1; i <= T; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            System.out.print("Case " + i + ": ");

            if (a == b) {
                System.out.println(sameNames[a]);
            } else {
                int max = Math.max(a, b);
                int min = Math.min(a, b);
                if (max == 6 && min == 5) {
                    System.out.println("Sheesh Beesh");
                } else {
                    System.out.println(names[max] + " " + names[min]);
                }
            }
        }
    }
}