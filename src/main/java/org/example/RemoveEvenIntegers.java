package org.example;

public class RemoveEvenIntegers {
    public static void main(String args[]){

        int arr[] = {1, 2, 3, 7, 4, 10};
        removeEvenIntegers(arr);
    }
    public static void removeEvenIntegers(int arr[]){

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
