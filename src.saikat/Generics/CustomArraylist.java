package Generics;

import java.util.Arrays;

public class CustomArraylist {

    private int[] data;
    private static int Defalut_size = 10;
    private int size = 0;

    public CustomArraylist() {
        this.data = new int[Defalut_size];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // Copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public int remove(){
        int removed = data[size--];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArraylist list = new CustomArraylist();
        list.add(33);
        list.add(9);
        list.add(98);
        System.out.println(list);
    }
}
