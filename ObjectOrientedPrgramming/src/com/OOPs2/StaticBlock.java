package com.OOPs2;

import com.OOPs3.Polymorphisem.AccessModifier;

public class StaticBlock extends AccessModifier
{
    static int a = 10;
    static int b;

    static {
        StaticBlock.b = a * 10;
    }

    public StaticBlock(int a) {
        super(a);
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock(10);
        int y = obj.c;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


    }
}
