package dsajava;

import java.util.HashSet;

public class ContainsDuplicate {
	
	
	public static boolean containsDuplicate(int[] nums) {
		
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;  // duplicate found
            }
            set.add(num);
        }
        return false;  // no duplicates
    }

	
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1}; // test array
        boolean result = containsDuplicate(nums);
        System.out.println("Contains duplicate? " + result);
        
    }
    
    

}
