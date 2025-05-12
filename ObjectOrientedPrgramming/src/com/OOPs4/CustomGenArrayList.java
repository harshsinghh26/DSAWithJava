package com.OOPs4;

import java.util.Arrays;
import java.util.Objects;

public class CustomGenArrayList <T> {


    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        return (T) data[--size];
    }

    public T get(int index){
        return (T) data[index];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.remove();
        System.out.println(list);
    }
}
