package com.OOPs3.Polymorphisem;

public class A extends AccessModifier{
    public A(int a) {
        super(a);
    }

    public static void main(String[] args) {
        AccessModifier bj = new AccessModifier(10);
        int y = bj.c;
    }

}
