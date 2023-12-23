package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main (String args[]){
        String input = "listen";
        String reference = "silent";

        if (isAnagram(input, reference)) {
            System.out.println(input + " is an anagram of " + reference + ".");
        } else {
            System.out.println(input + " is not an anagram of " + reference + ".");
        }
    }
    public static boolean isAnagram (String t, String r){

        boolean status = false;

        t = t.replace("\\s", "").toLowerCase();
        r = r.replace("\\s", "").toLowerCase();

        if (t.length() != r.length()){
            status = false;
        }
        char[] char1 = t.toCharArray();
        char[] char2 = r.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1, char2)){
            status = true;
        }
        return status;
    }
}
