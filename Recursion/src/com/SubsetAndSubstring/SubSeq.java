package com.SubsetAndSubstring;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subSeqAs("", "abc");

    }

    // Print sub Seq


    static void subSeq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    // Add in Array list

    static ArrayList<String> subSeqA(String p, String up){
        ArrayList<String> str = new ArrayList<>();
        if (up.isEmpty()){;
            str.add(p);
            return str;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqA(p + ch, up.substring(1));
        ArrayList<String> right =  subSeqA(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    // Print Sub Seq with Asscaii Value

    static void subSeqAs(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeqAs(p + ch, up.substring(1));
        subSeqAs(p, up.substring(1));
        subSeqAs(p + (ch +0), up.substring(1));

    }


    //  add it in array list

    static ArrayList<String> subSeqAscaii(String p, String up){
        ArrayList<String> str = new ArrayList<>();
        if (up.isEmpty()){;
            str.add(p);
            return str;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqAscaii(p + ch, up.substring(1));
        ArrayList<String> right =  subSeqAscaii(p, up.substring(1));
        ArrayList<String> asscaii = subSeqAscaii(p + (ch + 0), up.substring(1));

        left.addAll(right);
        left.addAll(asscaii);
        return left;
    }
}
