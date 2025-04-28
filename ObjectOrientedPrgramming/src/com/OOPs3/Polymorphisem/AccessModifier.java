package com.OOPs3.Polymorphisem;

public class AccessModifier {
    int a;
    private int b;
    protected int c;
    public int d;

//    AccessModifier() {
//        this.a = 10;
//        this.b = 12;
//        this.c = 123;
//        this.d = 234;
//    }
    public AccessModifier(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }
}
