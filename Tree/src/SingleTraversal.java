import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SingleTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List < Integer > pre = new ArrayList < > ();
        List < Integer > in = new ArrayList < > ();
        List < Integer > post = new ArrayList < > ();
        preInPost(root, pre, in, post);

        System.out.println("The preorder Traversal is : ");
        for (int nodeVal: pre) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();
        System.out.println("The inorder Traversal is : ");
        for (int nodeVal: in ) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();
        System.out.println("The postorder Traversal is : ");
        for (int nodeVal: post) {
            System.out.print(nodeVal + " ");
        }
        System.out.println();

    }

    public static void preInPost(Node root, List<Integer> preOrder, List<Integer> inOrder, List<Integer> postOrder){
        Stack<Pair> stack =  new Stack<>();
        stack.push(new Pair(root, 1));

        if(root == null) return;

        while(!stack.isEmpty()){
            Pair it = stack.pop();

            if(it.num == 1){
                preOrder.add(it.node.data);
                it.num++;
                stack.push(it);
                if(it.node.left != null){
                    stack.push(new Pair(it.node.left, 1));
                }
            }
            else if(it.num == 2){
                inOrder.add(it.node.data);
                it.num++;
                stack.push(it);
                if(it.node.right != null){
                    stack.push(new Pair(it.node.right, 1));
                }
            }
            else{
                postOrder.add(it.node.data);
            }
        }
    }

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class Pair {
        Node node;
        int num;
        Pair(Node node, int num) {
            this.num = num;
            this.node = node;
        }
    }

}
