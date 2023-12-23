package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequentElements {

    public static void main(String args[]){

        int nums[] = {1,1,1, 2, 2,2, 3};
        int k = 2;
        int [] result = topKFrequent(nums, k);
        for (int r: result){
            System.out.println(r);
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int i;
        for (i = 1; i < nums.length; i++){

           int n = map.putIfAbsent(i, nums[i]);
            count++;

        }
        System.out.println(count);
        return nums;
    }
}
