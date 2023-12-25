package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Splitlists {

    public static void main(String args[]){
        List<String> inputList = List.of("one", "two", "three", "four", "five", "six");

        List<String> list2 = splitListTest(inputList);
        System.out.println(list2.get(0));
    }
    public static List<String> splitList(List<String> list){

        List<String> li = new ArrayList<>();
        List<String> l2 = new ArrayList<>();

       for (int i = 0; i < list.size(); i++){
           if(i < (list.size() / 2)){
              li.add(list.get(i));
           }else {
               l2.add(list.get(i));
           }
       }
       return Collections.singletonList(li + " " + l2);
    }
    public static List<String> splitListTest(List<String> list){

        int midPoint = list.size() / 2;

        List<String> firstHalf = IntStream.range(0, midPoint)
                .mapToObj(list::get)
                .collect(Collectors.toList());

        List<String> secondHalf = IntStream.range(midPoint, list.size())
                .mapToObj(list::get)
                .collect(Collectors.toList());
        return List.of(String.join(" ", firstHalf), String.join(" ", secondHalf));
    }
}
