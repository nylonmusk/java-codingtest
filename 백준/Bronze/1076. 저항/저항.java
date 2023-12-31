import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);

        String firstColor = br.readLine();
        String secondColor = br.readLine();
        long answer = (map.get(firstColor) * 10L) + map.get(secondColor);

        String thirdColor = br.readLine();
        answer *= (long) Math.pow(10, map.get(thirdColor));

        System.out.println(answer);
    }
}
