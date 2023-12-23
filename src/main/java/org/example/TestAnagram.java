package org.example;

import java.util.Arrays;

public class TestAnagram {

    public static void main(String args[]){
        String input = "listen";
        String reference = "silent";

        if (test(input, reference)) {
            System.out.println(input + " is an anagram of " + reference + ".");
        } else {
            System.out.println(input + " is not an anagram of " + reference + ".");
        }
    }
    public static boolean test(String s, String t){
        boolean isAnagram = false;
        if (s.length() != t.length()){
            System.out.println("S is not anagram of t");
        }
        char scharacter[] = s.toCharArray();
        char tcharacter[] = t.toCharArray();

        Arrays.sort(scharacter);
        Arrays.sort(tcharacter);

        if (Arrays.equals(scharacter, tcharacter)){
            isAnagram = true;
        }
        return isAnagram;
    }
}
