import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        List<String> increasingList = new ArrayList<>(list);
        List<String> decreasingList = new ArrayList<>(list);
        Collections.sort(increasingList);
        Collections.sort(decreasingList, Collections.reverseOrder());

        if (increasingList.toString().equals(list.toString())) {
            System.out.println("INCREASING");
        } else if (decreasingList.toString().equals(list.toString())) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }

    }
}
