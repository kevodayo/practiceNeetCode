package org.example;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {

    public static void main(String args[]){
        int arr[] = {1, 3, 4, 2, 2};
        checkDuplicate(arr);
    }
    public static boolean checkDuplicate(int arr[]){

        boolean status = false;
        int count = 1;
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            if (hashMap.containsValue(arr[i])){
                count ++;
                status = true;
            }else {
                hashMap.put(i, arr[i]);
            }
        }
        System.out.println(count +" "+ status);
        return status;
    }
}
