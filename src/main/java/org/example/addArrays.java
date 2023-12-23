package org.example;

import java.util.Arrays;

public class addArrays {
    public static void main (String args[]){
        int nums[] = {1, 3, 6};
        int nums2[] = {7, 9};

        findMedian(nums, nums2);
    }
    public static int findMedian(int nums1[], int nums2[]){

       int m = nums1.length;
       int n = nums2.length;
       int sum = 0;
       int median;
       int result[] = new int[m + n];
       int p = result.length;
       System.arraycopy(nums1,0,result,0,m);
       System.arraycopy(nums2, 0,result, m, n);

        for (int i = 0; i < p; i++){
            sum += result[i];
        }
        if (p % 2 != 0){
            median = sum / 2;
        }else {
            median = (sum / 2) + 1;
        }
        System.out.println(Arrays.toString(result));
        System.out.println(median);
        return median;
    }
}
