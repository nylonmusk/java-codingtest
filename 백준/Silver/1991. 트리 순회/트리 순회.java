import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    char value;
    Node left;
    Node right;
}

public class Main {
    private static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Node[] binaryTree = new Node[N + 1];

        for (int i = 1; i <= N; i++) {
            binaryTree[i] = new Node();
        }

        for (int i = 1; i <= N; i++) {
            String[] input = br.readLine().split(" ");
            char value = input[0].charAt(0);
            char left = input[1].charAt(0);
            char right = input[2].charAt(0);

            binaryTree[value - 'A' + 1].value = value;
            if (left != '.') binaryTree[value - 'A' + 1].left = binaryTree[left - 'A' + 1];
            if (right != '.') binaryTree[value - 'A' + 1].right = binaryTree[right - 'A' + 1];
        }

        preorder(binaryTree[1]);
        answer.append("\n");
        inorder(binaryTree[1]);
        answer.append("\n");
        postorder(binaryTree[1]);

        System.out.println(answer);
    }

    private static void preorder(Node node) {
        answer.append(node.value);
        if (node.left != null) preorder(node.left);
        if (node.right != null) preorder(node.right);
    }

    private static void inorder(Node node) {
        if (node.left != null) inorder(node.left);
        answer.append(node.value);
        if (node.right != null) inorder(node.right);
    }

    private static void postorder(Node node) {
        if (node.left != null) postorder(node.left);
        if (node.right != null) postorder(node.right);
        answer.append(node.value);
    }
}