public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }
    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean Insert(int item) {
        if(this.isFull()){
            int[] temp = new int[data.length * 2];

            for(int i = 0; i < data.length; i++){
                temp[i] = data[(first + i) % (data.length)];
            }
            first = 0;
            end = data.length;
            data = temp;
        }

        return super.Insert(item);
    }
}
