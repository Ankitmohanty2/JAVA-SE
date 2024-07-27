public class ArrayInitialization {
    public static void main(String[] args) {
        // Method 1: Declaration and Initialization
        int[] arr1 = new int[5];

        
        int[] arr2 = {1, 2, 3, 4, 5};

        // Method 3: Using new Keyword with Values
        int[] arr3 = new int[]{1, 2, 3, 4, 5};

        // Method 4: Multi-dimensional Array
        int[][] arr4 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Method 5: Initialization in a Loop
        int[] arr5 = new int[5];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = i + 1;
        }

        // Method 6: Using Arrays.fill
        int[] arr6 = new int[5];
        Arrays.fill(arr6, 10);

        // Print arrays to verify
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println("arr4: " + Arrays.deepToString(arr4));
        System.out.println("arr5: " + Arrays.toString(arr5));
        System.out.println("arr6: " + Arrays.toString(arr6));
    }
}
