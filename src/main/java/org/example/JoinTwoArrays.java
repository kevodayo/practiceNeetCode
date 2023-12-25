package org.example;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinTwoArrays {

    public static void main(String args[]){
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("test");
        l1.add("here");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("one");
        l2.add("two");

        ArrayList<String> list = joinTwoArrays(l1, l2);
        System.out.println(list);
    }
    public static ArrayList<String> joinTwoArrays(ArrayList<String> l1, ArrayList<String> l2){
        ArrayList<String> arrayList = new ArrayList<>();
        l1.addAll(l2);
        arrayList.addAll(l1);

        return arrayList;
    }
}
