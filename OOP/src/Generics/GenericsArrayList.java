package Generics;

import java.util.Arrays;

public class GenericsArrayList <T> {
    public static void main(String[] args) {
        GenericsArrayList<Integer> list = new GenericsArrayList<>();

        for(int i = 0; i < 20; i++){
            list.add(2 * i);
        }

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(5));
    }

    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public GenericsArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T value){
        if(isFull()){
            resize();
        }

        data[size++] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T get (int index){
        return (T)(data[index]);
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public int size(){
        return data.length;
    }

    public T remove(){
        return (T)(data[--size]);
    }

    @Override
    public String toString() {
        return "GenericsArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }
}
