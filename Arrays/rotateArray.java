public class ArrayRotation {

  
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        // Handle case when k is greater than n
        k = k % n;
        
        // Reverse the whole array
        reverse(arr, 0, n - 1);
        // Reverse the first part (0 to k-1)
        reverse(arr, 0, k - 1);
        // Reverse the second part (k to n-1)
        reverse(arr, k, n - 1);
    }
    
    // Helper method to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("Original array:");
        printArray(arr);

        rotate(arr, k);
        
        System.out.println("Array after rotating by " + k + " positions:");
        printArray(arr);
    }
}
