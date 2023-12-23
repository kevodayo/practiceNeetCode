package org.example;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashTable {

    public static void main(String args[]){

        HashSet<String> set = new HashSet<>();
        set.add("kevine");
        set.add("Ten hag");
        set.add("Egerton");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
