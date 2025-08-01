import java.io.*;
import java.util.*;

public class Main {
    static List<Integer> preorder = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null && !line.equals("")) {
            preorder.add(Integer.parseInt(line));
        }

        postOrder(0, preorder.size() - 1);
    }

    static void postOrder(int start, int end) {
        if (start > end) return;

        int root = preorder.get(start);
        int idx = start + 1;

        while (idx <= end && preorder.get(idx) < root) {
            idx++;
        }

        postOrder(start + 1, idx - 1);
        postOrder(idx, end);
        System.out.println(root);
    }
}