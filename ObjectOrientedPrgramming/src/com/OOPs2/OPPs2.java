package com.OOPs2;

public class OPPs2 {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hello, How are you!!");
        System.out.println(population);
    }

    public OPPs2 (int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        OPPs2.population += 1;
//        message();
    }

}
