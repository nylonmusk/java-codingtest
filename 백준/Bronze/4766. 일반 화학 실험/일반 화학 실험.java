import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Double> list = new ArrayList<>();
        while (true) {
            double temp = Double.parseDouble(br.readLine());
            if (temp == 999) break;
            list.add(temp);
        }

        for (int i = 1; i < list.size(); i++) {
            double diff = list.get(i) - list.get(i - 1);
            System.out.printf("%.2f%n", diff);
        }
    }
}