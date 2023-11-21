import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.parseInt(st.nextToken()));
        numbers.add(Integer.parseInt(st.nextToken()));
        numbers.add(Integer.parseInt(st.nextToken()));
        numbers.sort((a, b) -> a - b);

        for (String s : br.readLine().split("")) {
            if (s.equals("A")) {
                System.out.print(numbers.get(0));
            } else if (s.equals("B")) {
                System.out.print(numbers.get(1));
            } else if (s.equals("C")) {
                System.out.print(numbers.get(2));
            }
            System.out.print(" ");
        }
    }
}
