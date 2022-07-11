import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        ArrayList < Integer > preOrder = new ArrayList < > ();
        printPreorder(root, preOrder);

        System.out.println("Preorder: ");
        for(int i = 0; i < preOrder.size(); i++){
            System.out.print(preOrder.get(i) + " ");
        }

        ArrayList<Integer> inOrder = new ArrayList<>();
        printInorder(root, inOrder);

        System.out.println("\nInorder: ");
        for(int i = 0; i < inOrder.size(); i++){
            System.out.print(inOrder.get(i) + " ");
        }

        ArrayList<Integer> postOrder = new ArrayList<>();
        printPostorder(root, postOrder);

        System.out.println("\nPostorder: ");
        for(int i = 0; i < postOrder.size(); i++){
            System.out.print(postOrder.get(i) + " ");
        }

        System.out.println("\nLevel Order: ");
        System.out.println(levelOrder(root));


    }

    public static void printPreorder(Node node, ArrayList<Integer> preorder) {
        if (node == null) {
            return;
        }

        preorder.add(node.data);
        printPreorder(node.left, preorder);
        printPreorder(node.right, preorder);
    }

    public static void printInorder(Node node, ArrayList<Integer> inorder){
        if(node == null){
            return;
        }

        printInorder(node.left, inorder);
        inorder.add(node.data);
        printInorder(node.right, inorder);
    }

    public static void printPostorder(Node node, ArrayList<Integer> postorder){
        if(node == null){
            return;
        }

        printPostorder(node.left, postorder);
        printPostorder(node.right, postorder);
        postorder.add(node.data);
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null ){
            return ans;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int height = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < height; i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                list.add(queue.poll().data);
            }
            ans.add(list);
        }
        return ans;
    }

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}
