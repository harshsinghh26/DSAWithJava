package com.OOPs3.Inharitance;

public class Auth {
    String name;
    String email;
    String password;

    Auth (){
//        System.out.println("User Created");
        this.name = "admin";
        this.email = "admin@google.com";
        this.password = "@53bfd63r92";
    }

    Auth(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    Auth (Auth other){
        this.name = other.name;
        this.email = other.email;
        this.password = other.password;
    }
}
