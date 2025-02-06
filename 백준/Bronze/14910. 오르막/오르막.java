import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> duplicateList = new ArrayList<>(list);
        list.sort(Integer::compareTo);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != duplicateList.get(i)) {
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");
    }
}
