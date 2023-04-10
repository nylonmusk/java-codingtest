import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];

        for (int i = 1; i <= 28; i++) {
            int temp = Integer.parseInt(br.readLine());
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        int j = 0;
        for (int i = 1; i <= 30; i++) {
            if (!map.containsKey(i)) {
                arr[j] = i;
                j++;
                if (j == 2) {
                    break;
                }
            }
        }
        Arrays.sort(arr);

        bw.write(Integer.toString(arr[0]));
        bw.newLine();
        bw.write(Integer.toString(arr[1]));
        bw.flush();
        bw.close();
    }
}