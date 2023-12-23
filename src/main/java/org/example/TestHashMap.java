package org.example;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main (String args[]){

        Map<String, String > map = new HashMap<>();

        map.put("name", "kevine");
        map.put("company", "Turnkey");
        map.put("age", "26");

        if (map.containsKey("name")){
            System.out.println(map.get("name"));
        }
        for (Map.Entry<String, String> e: map.entrySet()){
            System.out.println( e.getKey() +" " + e.getValue());
        }
    }
}
