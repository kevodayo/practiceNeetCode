package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestArrays {

    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        List<String> sol = removeDuplicate(list);
        System.out.println("Test this out" + sol);
    }
    public static List<String> test(List<String> list){

        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if (!list1.contains(list.get(i))){
                list1.add(list.get(i));
            }
        }
        return list1;
    }
    public static List<String> removeDuplicate(List<String> list){
        List<String> list1 = list.stream().distinct().
                collect(Collectors.toList());
        return list1;
    }
}
