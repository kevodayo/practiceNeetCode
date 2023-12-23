package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        twoSum();
        useHashMaps();
        DeclarativeProgramming declarativeProgramming = new DeclarativeProgramming();
    }

    public static void twoSum() {
        int arr[] = {1, 2, 4, 5};
        int target = 3;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] + arr[j] == target) {
                    System.out.println("These are the two indices" + i + "and" + j);
                }
        }
    }
    public static void useHashMaps() {
        int arr[] = {1, 2, 4, 5};
        int target = 6;
        HashMap<Integer, Integer> sum = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int numb =  target - arr[i];
            if(sum.containsKey(numb)){
                arr[0] = sum.get(numb);
                arr[1] = i;
                System.out.println(arr[numb] +"and"+ arr[i]);
            }else {
                sum.put(arr[i], i);
            }
        }
    }
}