package com.OOPs4;

import java.util.Arrays;

public class CustomArrayList {


    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.remove();
        System.out.println(list);
    }
}
