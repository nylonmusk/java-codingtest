import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.sort((a, b) -> a - b);
        System.out.println(list.get(1));
    }
}
