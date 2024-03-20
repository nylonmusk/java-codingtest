import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> map = new HashMap<>();
//        0000    1 2222 3333 4  4 5555 6666 7777 8888 9999
//        0  0    1    2    3 4  4 5    6       7 8  8 9  9
//        0  0    1 2222 3333 4444 5555 6666    7 8888 9999
//        0  0    1 2       3    4    5 6  6    7 8  8    9
//        0000    1 2222 3333    4 5555 6666    7 8888    9
        map.put(0, "0000\n0  0\n0  0\n0  0\n0000\n");
        map.put(1, "   1\n   1\n   1\n   1\n   1\n");
        map.put(2, "2222\n   2\n2222\n2\n2222\n");
        map.put(3, "3333\n   3\n3333\n   3\n3333\n");
        map.put(4, "4  4\n4  4\n4444\n   4\n   4\n");
        map.put(5, "5555\n5\n5555\n   5\n5555\n");
        map.put(6, "6666\n6\n6666\n6  6\n6666\n");
        map.put(7, "7777\n   7\n   7\n   7\n   7\n");
        map.put(8, "8888\n8  8\n8888\n8  8\n8888\n");
        map.put(9, "9999\n9  9\n9999\n   9\n   9\n");
        for (String s : br.readLine().split("")) {
            int n = Integer.parseInt(s);
            System.out.println(map.get(n));
        }
    }
}