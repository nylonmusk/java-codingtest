import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        int left = 0;
        int height = 0;
        for (int i = 0; i < N; i++) {
            int trophy = Integer.parseInt(br.readLine());
            list.add(trophy);
            if (height < trophy) {
                height = trophy;
                left++;
            }
        }

        int right = 0;
        height = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (height < list.get(i)) {
                height = list.get(i);
                right++;
            }
        }

        System.out.println(left);
        System.out.println(right);
    }
}
