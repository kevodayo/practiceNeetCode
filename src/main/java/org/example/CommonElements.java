package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class CommonElements {

    public static void main(String args[]){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        List<String> l1 = Arrays.asList("test", "one", "two", "three");
        list1.addAll(l1);

        List<String> l2 = Arrays.asList("test", "four", "two", "five");
        list2.addAll(l2);

//        System.out.println(list2);

        ArrayList<String> list = getCommonArraysTest(list1, list2);
        System.out.println(list);
    }
    public static ArrayList<String> getCommonArrays(ArrayList<String> l1, ArrayList<String> l2){

        ArrayList<String> list = new ArrayList<>(l1);
        list.retainAll(l2);
//        for (int i = 0; i < l1.size(); i++){
//            for (int j = i +1; j < l2.size(); j++){
//                if(l1.get(i).equalsIgnoreCase(l2.get(j))){
//                    list.add(l1.get(i));
//                }
//            }
//        }
        return list;
    }
    public static ArrayList<String> getCommonArraysTest(ArrayList<String> l1, ArrayList<String> l2){
        ArrayList<String> list = new ArrayList<>();
        Map<Object, Object> map = new HashMap<>();
        l1.stream().map(String::toUpperCase).forEach(element -> map.put(element, 1));
//        for (int i = 0; i < l1.size(); i++){
//            map.put(l1.get(i), i);
//        }
        l2.stream().map(String::toUpperCase).forEach(element -> {
            if (map.containsKey(element)){
                list.add(element);
            }
        });
//        for (String element: l2){
//            if (map.containsKey(element)){
//               list.add(element);
//            }
//        }
        return list;
    }
}
