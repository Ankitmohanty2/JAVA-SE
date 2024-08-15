package array;

import java.util.List;
import ds.MinHeap;

/**
 * This class provides a method to merge M sorted array streams into a single sorted array.
 * The approach uses a min-heap to efficiently find the smallest element among the arrays at each step.
 * 
 * @author Ankit Mohanty
 */
public class MergeKSortedArrays {

    /**
     * Merges M sorted arrays into a single sorted array.
     *
     * @param arrays A list of sorted integer arrays to be merged.
     * @param total The total number of elements across all arrays.
     * @return A single merged sorted array containing all elements from the input arrays.
     */
    public static int[] mergeArray(List<int[]> arrays, int total) {
        int[] res = new int[total]; // Result array to hold the merged output
        MinHeap<Pair> h = new MinHeap<Pair>(Pair.class, arrays.size()); // Min-heap to manage the smallest elements
        int[] pointers = new int[arrays.size()]; // Array to keep track of the current index of each input array
        int count = 0; // Counter to keep track of the number of elements added to the result array

        // Initialize the heap with the first element of each array
        for (int i = 0; i < arrays.size(); i++) {
            h.add(new Pair(arrays.get(i)[0], i));
            pointers[i]++;
        }

        // Extract the smallest element from the heap and add the next element from the same array to the heap
        while (count < total) {
            Pair pair = h.extractMin(); // Extract the minimum element from the heap
            res[count] = pair.value; // Add it to the result array
            count++;

            // If there are more elements in the same array, add the next element to the heap
            if (pointers[pair.arrIndex] < arrays.get(pair.arrIndex).length) {
                h.add(new Pair(arrays.get(pair.arrIndex)[pointers[pair.arrIndex]], pair.arrIndex));
                pointers[pair.arrIndex] += 1; // Move the pointer to the next element in the array
            }
        }

        return res; // Return the merged sorted array
    }
}

/**
 * Helper class to store the value and index of the array from which the value is extracted.
 * Implements Comparable to allow sorting within the MinHeap.
 */
class Pair implements Comparable<Pair> {

    int value; // The value from the array
    int arrIndex; // The index of the array from which the value was taken

    public Pair(int value, int arrIndex) {
        this.value = value;
        this.arrIndex = arrIndex;
    }

    @Override
    public int compareTo(Pair o) {
        return this.value < o.value ? -1 : 1; // Compare pairs based on their values
    }
}
