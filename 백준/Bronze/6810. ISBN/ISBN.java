import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] isbn = {9, 7, 8, 0, 9, 2, 1, 4, 1, 8};

        for (int i = 0; i < 3; i++) {
            isbn = append(isbn, Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        for (int i = 0; i < 13; i++) {
            sum += isbn[i] * (i % 2 == 0 ? 1 : 3);
        }

        System.out.println("The 1-3-sum is " + sum);
    }

    private static int[] append(int[] arr, int value) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        result[arr.length] = value;
        return result;
    }
}