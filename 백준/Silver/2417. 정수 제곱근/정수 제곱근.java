import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        System.out.println(binarySearch(n));
    }

    static long binarySearch(long key) {
        long left = 0;
        long right = key;
        long answer = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (key <= Math.pow(mid, 2)){
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
}