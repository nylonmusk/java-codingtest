import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SerialNumberComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int sumA = sum(a);
        int sumB = sum(b);
        if (a.length() != b.length()) {
            return a.length() - b.length();
        } else if (sumA != sumB) {
            return sumA - sumB;
        } else {
            return a.compareTo(b);
        }
    }

    static int sum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - 48;
            }
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> serialNumber = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            serialNumber.add(br.readLine());
        }

        Collections.sort(serialNumber, new SerialNumberComparator());

        for (String serial : serialNumber) {
            System.out.println(serial);
        }
    }
}
