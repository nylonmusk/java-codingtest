import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int diff = arr[1] - arr[0];
        boolean isArithmetic = true;
        for(int i = 2; i < N; i++) {
            if(arr[i] - arr[i - 1] != diff) {
                isArithmetic = false;
                break;
            }
        }

        if(isArithmetic) {
            System.out.println(arr[N - 1] + diff);
        } else {
            int ratio = arr[1] / arr[0];
            System.out.println(arr[N - 1] * ratio);
        }
    }
}