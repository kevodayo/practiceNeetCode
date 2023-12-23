package org.example;

public class BinaryString {

    public static void main(String args[]){
        BinaryString solution = new BinaryString();

        // Example usage
        int result = solution.solution(9);
        System.out.println("Longest binary gap: " + result);
    }
    public  int solution(int N) {

        String binaryString = Integer.toBinaryString(N);

        // Split the binary representation into an array of strings
        String[] binaryArray = binaryString.split("1");

        // Initialize variables to keep track of the longest binary gap
        int maxGap = 0;

        // Iterate through the array to find the longest binary gap
        for (String gap : binaryArray) {
            int gapLength = gap.length();

            // Update maxGap if the current gap is longer
            if (gapLength > maxGap) {
                maxGap = gapLength;
            }
        }

        // Return the length of the longest binary gap
        return maxGap;
    }
}
