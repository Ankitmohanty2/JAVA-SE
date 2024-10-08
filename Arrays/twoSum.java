import java.util.HashMap;
import java.util.Map;

public class Solution {
   
    public int[] twoSum(int[] nums, int target) {
       
        Map<Integer, Integer> hashmap = new HashMap<>();
        
       
        for (int i = 0; i < nums.length; i++) {
            hashmap.put(nums[i], i);
        }
        
     
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
          
            if (hashmap.containsKey(complement) && hashmap.get(complement) != i) {
                
                return new int[] { i, hashmap.get(complement) };
            }
        }
        
        
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
      
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        
        Solution solution = new Solution();
        
        
        int[] result = solution.twoSum(nums, target);
        
      
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
