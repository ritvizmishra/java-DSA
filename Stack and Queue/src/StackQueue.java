import java.util.*;

public class StackQueue {
    public static void main(String[] args) {

//        STACK
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

//        QUEUE
        Queue<Integer> queue = new LinkedList<>();

        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

//        DEQUE
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(13);
        deque.offerLast(14);
        deque.offerFirst(12);
        deque.offerLast(15);
        deque.offerFirst(11);

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());

    }
}
