package com.OOPs3.Inharitance;

public class GitAuth extends AuthwithGoogle {
    String github;

    GitAuth() {
        this.github = "Login with github";
    }

    public GitAuth(String n, String e, String p, String google, String github) {
        super(n, e, p, google);
        this.github = github;
    }

    GitAuth(Auth o, String go, String github){
        super(o, go);
        this.github = github;
    }
}
