public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int first = 0;
    int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean Insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove (){
        int removed = data[first++];
        first = first % data.length;
        size--;
        return removed;
    }

    public int getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[first];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = first;
        do{
            System.out.print((data[i]) + " -> ");
            i++;
            i %= data.length;
        }while(i < end);
        System.out.println("END");
    }


    public boolean isFull() {
        return size == data.length - 1;
    }
    public boolean isEmpty(){
        return size == -1;
    }
}
