package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()) {
            resize();
        }

        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

//        copying element of data into temporary array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp; // update data
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int num){
        data[index] = num;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList;

        CustomArrayList list = new CustomArrayList();
//        list.add(0);
//        list.add(10);
//        list.add(100);
        for(int i = 0; i < 19; i++){
            list.add(2 * i);
        }

        list.set(1, 20);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());

    }
}
