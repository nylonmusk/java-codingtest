import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());

        int totalWidth = 3 + s * 2;

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
                if (j < 2) {
                    for (int k = 0; k < s; k++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < s + 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}