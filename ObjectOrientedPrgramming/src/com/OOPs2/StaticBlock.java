package com.OOPs2;

public class StaticBlock {
    static int a = 10;
    static int b;

    static {
        StaticBlock.b = a * 10;
    }

    public static void main(String[] args) {
//        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
