package com.OOPs1;

public class OOPs1 {
    public static void main(String[] args) {

        Student harsh = new Student(26, "Harsh Singh", 80);
        Student kishan = new Student();

//        harsh.name = "Harsh Singh";
//        harsh.rno = 26;
//        harsh.marks = 80;

//        System.out.println(harsh.name);
//        System.out.println(harsh.rno);
//        System.out.println(harsh.marks);
//
//        System.out.println(kishan.name);
//        System.out.println(kishan.rno);
//        System.out.println(kishan.marks);

//        harsh.greeting();

        Student random = new Student(harsh);
        System.out.println(random.marks);



    }

}

class Student {
    int rno;
    String name;
    float marks;

    Student () {
        rno = 13;
        name = "Kishan Singh";
        marks = 76;
    }

    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    void greeting() {
        name = "Vidisha";
        System.out.println("Hello, Good Morning, "+ this.name);
    }

    Student (int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}