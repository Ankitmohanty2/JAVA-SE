import java.util.HashMap;
import java.util.Map;

public class Solution {
    // Method to find two indices such that their values add up to the target
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the value and its corresponding index
        Map<Integer, Integer> hashmap = new HashMap<>();
        
        // First pass: populate the hash map with value-index pairs
        for (int i = 0; i < nums.length; i++) {
            hashmap.put(nums[i], i);
        }
        
        // Second pass: check for each number if its complement (target - nums[i]) exists in the map
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If complement is found in the map and is not the same element
            if (hashmap.containsKey(complement) && hashmap.get(complement) != i) {
                // Return the indices of the current number and its complement
                return new int[] { i, hashmap.get(complement) };
            }
        }
        
        // If no such pair is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Call the twoSum method and capture the result
        int[] result = solution.twoSum(nums, target);
        
        // Print the output
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
