import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {

    public static void main(String[] args) {
        
        int[] array1 = new int[5];
        Arrays.fill(array1, 0);

   
        int[] array2 = {1, 2, 3, 4, 5};

     
        System.out.println("First element: " + array2[0]);
        System.out.println("Third element: " + array2[2]);

        // Modifying array elements
        array2[1] = 10;
        System.out.println("Modified second element: " + array2[1]);

        // Iterating through an array using a for loop
        System.out.println("Array elements using for loop:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        // Iterating through an array using a for-each loop
        System.out.println("Array elements using for-each loop:");
        for (int element : array2) {
            System.out.println(element);
        }

        // Finding the maximum element in an array
        int max = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
            }
        }
        System.out.println("Maximum value: " + max);

        // Finding the minimum element in an array
        int min = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] < min) {
                min = array2[i];
            }
        }
        System.out.println("Minimum value: " + min);

        // Calculating the sum of all elements
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum += array2[i];
        }
        System.out.println("Sum of elements: " + sum);

        // Reversing an array
        for (int i = 0; i < array2.length / 2; i++) {
            int temp = array2[i];
            array2[i] = array2[array2.length - 1 - i];
            array2[array2.length - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(array2));

        // Sorting an array
        int[] array3 = {5, 2, 8, 3, 9};
        Arrays.sort(array3);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(array3));

        // Custom sorting an array in descending order
        Integer[] array4 = {5, 2, 8, 3, 9};
        Arrays.sort(array4, (a, b) -> b - a);
        System.out.println("Sorted array in descending order: " + Arrays.toString(array4));

        // Copying an array
        int[] copyArray1 = new int[array2.length];
        System.arraycopy(array2, 0, copyArray1, 0, array2.length);
        System.out.println("Copied array using System.arraycopy(): " + Arrays.toString(copyArray1));

        int[] copyArray2 = Arrays.copyOf(array2, array2.length);
        System.out.println("Copied array using Arrays.copyOf(): " + Arrays.toString(copyArray2));

        // Converting array to list
        List<Integer> list = Arrays.asList(array4);
        System.out.println("Array converted to list: " + list);
    }
}
