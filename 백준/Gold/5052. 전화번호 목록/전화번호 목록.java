import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

class TrieNode {
    TrieNode[] children = new TrieNode[10];
    boolean isEndOfNumber;

    public TrieNode() {
        isEndOfNumber = false;
        for (int i = 0; i < 10; i++) {
            children[i] = null;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            TrieNode root = new TrieNode();
            boolean consistent = true;
            for (int i = 0; i < n; i++) {
                if (!insert(root, br.readLine())) {
                    consistent = false;
                }
            }
            System.out.println(consistent ? "YES" : "NO");
        }
    }

    private static boolean insert(TrieNode root, String key) {
        TrieNode pCrawl = root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - '0';
            if (pCrawl.children[index] == null) {
                pCrawl.children[index] = new TrieNode();
            }
            pCrawl = pCrawl.children[index];
            if (pCrawl.isEndOfNumber) {
                return false;
            }
        }
        pCrawl.isEndOfNumber = true;

        return !Arrays.stream(pCrawl.children).anyMatch(Objects::nonNull);
    }
}

