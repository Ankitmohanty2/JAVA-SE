package com.kunal;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        // Initialize an array with some values
        int[] nums = {7, 14, 21, 28}; 
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(nums));
        
        // Call the change method to modify the array
        change(nums);
        
        // Print the modified array
        System.out.println("Modified array: " + Arrays.toString(nums));
    }

    // Method to modify the first element of the array
    static void change(int[] arr) {
        arr[0] = 99; // Change the first element to 99
    }
}
