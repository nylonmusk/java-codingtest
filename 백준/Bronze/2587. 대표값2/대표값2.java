import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        
        // for문 귀찮아서 복사
        list.add(Integer.parseInt(br.readLine()));
        list.add(Integer.parseInt(br.readLine()));
        list.add(Integer.parseInt(br.readLine()));
        list.add(Integer.parseInt(br.readLine()));
        list.add(Integer.parseInt(br.readLine()));

        list.sort(Comparator.comparing(a -> a));
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum / 5);
        System.out.println(list.get(2));
    }
}