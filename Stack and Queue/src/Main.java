public class Main {
    public static void main(String[] args) throws StackException{
        CustomStack stackOne = new CustomStack(5);

        stackOne.push(5);
        stackOne.push(4);
        stackOne.push(3);
        stackOne.push(2);
        stackOne.push(1);

        System.out.println(stackOne.pop());
        System.out.println(stackOne.pop());
        System.out.println(stackOne.pop());
        System.out.println(stackOne.pop());
        System.out.println(stackOne.pop());

        DynamicStack stackTwo = new DynamicStack();

        stackTwo.push(11);
        stackTwo.push(10);
        stackTwo.push(9);
        stackTwo.push(8);
        stackTwo.push(7);
        stackTwo.push(6);


        System.out.println(stackTwo.pop());
        System.out.println(stackTwo.pop());
        System.out.println(stackTwo.pop());
        System.out.println(stackTwo.pop());
        System.out.println(stackTwo.pop());
        System.out.println(stackTwo.pop());

        CustomQueue queue = new CustomQueue(5);

        queue.Insert(12);
        queue.Insert(13);
        queue.Insert(14);
        queue.Insert(15);
        queue.Insert(16);
        queue.Insert(17);

        queue.display();

        CircularQueue queueTwo = new CircularQueue();

        queueTwo.Insert(17);
        queueTwo.Insert(19);
        queueTwo.Insert(20);
        queueTwo.Insert(21);
        queueTwo.Insert(22);
        queueTwo.Insert(23);

        queueTwo.display();

        System.out.println(queueTwo.remove());
        queueTwo.Insert(18);
        queueTwo.display();
    }
}
