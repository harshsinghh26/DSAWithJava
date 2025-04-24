package com.OOPs3.Inharitance;

public class AuthwithGoogle  extends Auth{
    String google;

    AuthwithGoogle() {
        this.google = "Login with Google";
    }


    AuthwithGoogle(String n, String e, String p, String google){
        super(n, e, p);
        this.google = google;
    }

    public AuthwithGoogle(Auth other, String google) {
        super(other);
        this.google = google;
    }
}
