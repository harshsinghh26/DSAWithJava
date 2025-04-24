package com.OOPs3.Inharitance;

public class Main {
    public static void main(String[] args) {
        Auth sauth = new Auth("harsh@123@google.com", "hardsh", "viha1726");
//        AuthwithGoogle ag = new AuthwithGoogle();
//        AuthwithGoogle ag2 = new AuthwithGoogle("harsh", "hast1@gmail.com", "2639839", "Login with google");
        AuthwithGoogle ag3 = new AuthwithGoogle();
//        AuthwithGoogle ag4 = new AuthwithGoogle(sauth, "Login with google");
//        AuthwithGoogle ag5 = new AuthwithGoogle(sauth.name, sauth.email, sauth.password, ag.google);
//        AuthwithGoogle ag6 = new AuthwithGoogle("google");
        GitAuth g1 = new GitAuth();
        GitAuth g2 = new GitAuth("has", "hs1@gamil.com", "137238", ag3.google, "hello");
        GitAuth g3 = new GitAuth(sauth, ag3.google, "hello");


        System.out.println(g3.name);
    }
}
