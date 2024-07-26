import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

           
            if (arr[mid] == key) {
                return mid;
            }

            // If key greater, ignore left half
            if (arr[mid] < key) {
                left = mid + 1;
            } 
            // If key is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 9};
        int key = 5;
        int result = binarySearch(arr, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
