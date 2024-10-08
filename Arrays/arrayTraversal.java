import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
       
        List<Integer> result = new ArrayList<>();
        
      
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Iterate through nums2
        for (int num : nums2) {
            // If the number exists in the map and its count is greater than 0
            if (map.containsKey(num) && map.get(num) > 0) {
                // Add the number to the result list
                result.add(num);
                // Decrease the count of the number in the map
                map.put(num, map.get(num) - 1);
            }
        }
        
        // Convert the result list to an array
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }
        
        // Return the intersection array
        return intersection;
    }

    // Main method to test the intersect method
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = solution.intersect(nums1, nums2);
        System.out.print("Intersection: ");
        printArray(result); // Output should be [2, 2]

        // Example 2
        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        result = solution.intersect(nums1, nums2);
        System.out.print("Intersection: ");
        printArray(result); // Output should be [4, 9]
    }

    // Helper method to print the elements of an array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
