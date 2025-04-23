package com.OOPs2;

public class person {
    public static void main(String[] args) {
        OPPs2 harsh = new OPPs2(23, "Harsh", 10000, false);

//        System.out.println(harsh.name);
        System.out.println(OPPs2.population);

        A obj;

        for(int i = 0; i<1000000000; i++){
            obj = new A("Random name");
        }
    }
}


class  A {
    final int num = 10;
    String name;

    public  A (String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being Destroyed!!");
    }
}