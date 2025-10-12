import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (N == 1) {
            System.out.println("A");
            return;
        }

        if (N == 2) {
            if (arr[0] == arr[1]) {
                System.out.println(arr[0]);
            } else {
                System.out.println("A");
            }
            return;
        }

        int a, b;
        if (arr[1] == arr[0]) {
            if (arr[2] != arr[1]) {
                System.out.println("B");
                return;
            }
            boolean same = true;
            for (int i = 1; i < N; i++) {
                if (arr[i] != arr[0]) {
                    same = false;
                    break;
                }
            }
            if (same) {
                System.out.println(arr[0]);
            } else {
                System.out.println("B");
            }
            return;
        } else {
            if ((arr[2] - arr[1]) % (arr[1] - arr[0]) != 0) {
                System.out.println("B");
                return;
            }
            a = (arr[2] - arr[1]) / (arr[1] - arr[0]);
            b = arr[1] - a * arr[0];
        }

        boolean ok = true;
        for (int i = 0; i < N - 1; i++) {
            if (arr[i + 1] != a * arr[i] + b) {
                ok = false;
                break;
            }
        }

        if (!ok) {
            System.out.println("B");
        } else {
            System.out.println(a * arr[N - 1] + b);
        }
    }
}