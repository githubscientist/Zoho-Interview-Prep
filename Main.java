import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class Tree {
    Node root;

    Tree() {
        this.root = null;
    }

    public Node insertNode(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data) {
            root.left = this.insertNode(root.left, data);
        } else {
            root.right = this.insertNode(root.right, data);
        }

        return root;
    }

    public void insert(int data) {
        this.root = this.insertNode(this.root, data);
    }

    public List<Integer> inorder(Node node, List<Integer> nodes) {
        if (node != null) {
            this.inorder(node.left, nodes);
            nodes.add(node.data);
            this.inorder(node.right, nodes);
        }
        return nodes;
    }

    public List<Integer> preorder(Node node, List<Integer> nodes) {
        if (node != null) {
            nodes.add(node.data);
            this.preorder(node.left, nodes);
            this.preorder(node.right, nodes);
        }
        return nodes;
    }

    public List<Integer> postorder(Node node, List<Integer> nodes) {
        if (node != null) {
            this.postorder(node.left, nodes);
            this.postorder(node.right, nodes);
            nodes.add(node.data);
        }
        return nodes;
    }

    List<Integer> levelorder() {
        List<Integer> nodes = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        if (this.root != null) {
            queue.add(this.root);

            while (!queue.isEmpty()) {
                Node node = queue.poll();
                nodes.add(node.data);

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return nodes;
    }
}

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(4);
        tree.insert(6);
        tree.insert(5);
        tree.insert(7);
        tree.insert(2);
        tree.insert(3);
        tree.insert(1);

        List<Integer> nodes = new ArrayList<>();

        System.out.println(tree.inorder(tree.root, nodes));

        nodes.clear();

        System.out.println(tree.preorder(tree.root, nodes));

        nodes.clear();

        System.out.println(tree.postorder(tree.root, nodes));

        System.out.println(tree.levelorder());
    }
}
