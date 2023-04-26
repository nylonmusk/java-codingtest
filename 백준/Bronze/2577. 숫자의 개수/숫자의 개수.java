import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        
        int product = num1 * num2 * num3;
        Map<Integer, Integer> countMap = new HashMap<>();
        
        while (product > 0) {
            int digit = product % 10;
            if (!countMap.containsKey(digit)) {
                countMap.put(digit, 1);
            } else {
                countMap.put(digit, countMap.get(digit) + 1);
            }
            product /= 10;
        }
        
        for (int i = 0; i <= 9; i++) {
            System.out.println(countMap.getOrDefault(i, 0));
        }
    }
}
