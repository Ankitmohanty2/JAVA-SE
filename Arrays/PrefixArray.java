package SummerTrainingGFG.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class calculates the prefix sum of an array.
 * Prefix sum is an array where each element at index `i` is the sum of all elements
 * from the start of the array up to index `i`.
 */
public class PrefixSumArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompt user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        // Prompt user to enter the elements of the array
        System.out.println("Enter the elements of the array separated by spaces:");
        String[] inputStrings = br.readLine().split(" ");
        int[] array = new int[size];

        // Convert input strings to integers and populate the array
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(inputStrings[i]);
        }

        // Calculate the prefix sum
        for (int i = 1; i < size; i++) {
            array[i] += array[i - 1];
        }

        // Display the prefix sum array
        System.out.print("Prefix Sum Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
