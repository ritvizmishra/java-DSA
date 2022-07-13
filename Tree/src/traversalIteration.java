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

        System.out.println("Postorder: ");
        System.out.println(postOrderTwoStack(root));

        System.out.println("Postorder: ");
        System.out.println(postOrderSingleStack(root));

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

    public static List<Integer> postOrderTwoStack (Node root){
        List<Integer> list = new ArrayList<>();
        Stack<Node> stackOne = new Stack<>();
        Stack<Node> stackTwo = new Stack<>();

        if(root == null) return list;

        stackOne.push(root);
        while(!stackOne.isEmpty()){
            root = stackOne.pop();
            stackTwo.add(root);
            if(root.left != null){
                stackOne.push(root.left);
            }
            if(root.right != null) {
                stackOne.push(root.right);
            }
        }
        while(!stackTwo.isEmpty()){
            list.add(stackTwo.pop().data);
        }
        return list;
    }

    public static List<Integer> postOrderSingleStack(Node root){
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if(root == null){
            return list;
        }
        Node curr = root;
        while(curr != null || !stack.isEmpty()){
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            else {
                Node temp = stack.peek().right;
                if(temp == null){
                    temp = stack.peek();
                    stack.pop();
                    list.add(temp.data);

                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.peek();
                        stack.pop();
                        list.add(temp.data);
                    }
                }else{
                    curr = temp;
                }
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
