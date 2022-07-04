package Generics;

import java.util.Arrays;
import java.util.List;

public class WildCard<T extends Number> {
    public static void main(String[] args) {
        WildCard<Integer> list = new WildCard<>();

        for(int i = 0; i < 20; i++){
            list.add(2 * i);
        }

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(5));
    }

    public void getList(List<? extends Number> list){
//        can import subclasses of number
    }

    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCard(){
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
