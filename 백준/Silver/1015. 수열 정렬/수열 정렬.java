import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");

        Pair[] arr = new Pair[N];
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(tokens[i]);
            arr[i] = new Pair(val, i);
        }

        Arrays.sort(arr, (p1, p2) -> {
            if (p1.value != p2.value) {
                return p1.value - p2.value;
            } else {
                return p1.index - p2.index;
            }
        });

        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[arr[i].index] = i;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(P[i] + " ");
        }
    }
}