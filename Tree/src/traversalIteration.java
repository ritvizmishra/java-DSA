import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class traversalIteration {
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

        System.out.println("Preorder: ");
        System.out.println(preOrder(root));

        System.out.println("Inorder: ");
        System.out.println(inOrder(root));

    }
    public static List<Integer> preOrder(Node root){
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            root = stack.pop();
            list.add(root.data);

            if(root.right != null){
                stack.push(root.right);
            }
            if(root.left != null){
                stack.push(root.left);
            }
        }
        return list;
    }

    public static List<Integer> inOrder(Node root){
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node node = root;

        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                list.add(node.data);
                node = node.right;
            }
        }
        return list;
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
