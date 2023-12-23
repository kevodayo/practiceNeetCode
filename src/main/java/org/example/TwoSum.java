package org.example;

import java.util.HashMap;

public class TwoSum {

    public static void main(String args[]){
        int arr[] = {1, 5, 9, 5, 2, 4};
        int target = 6;

        addTwoArrayDigits(arr, target);
    }
    private static void addTwoArrayDigits(int arr[], int target){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            int numb = target - arr[i];

            if (hashMap.containsKey(numb)){
                arr[0] = hashMap.get(numb);
                arr[1] = i;
                System.out.println(arr[0] +"and"+ arr[1]);
            }else {
                hashMap.put(arr[i], i);
            }
        }
    }
}
