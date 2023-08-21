import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        Arrays.sort(arr);
        int sum = 0;
        StringBuilder answer = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += Integer.parseInt(arr[i]);
            answer.append(arr[i]);
        }

        if (arr[0].equals("0") && sum % 3 == 0) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}

