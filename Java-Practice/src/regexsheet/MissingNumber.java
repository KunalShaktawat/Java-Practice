package regexsheet;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
	public static int missingNumber(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<=n;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
	// Optimized
	public static int missingNumber2(int[] nums) {
        int n=nums.length;
        int mustSum=n*(n+1)/2;
        int actualSum=0;
        for(int i:nums) {
        	actualSum+=i;
        }
        return mustSum-actualSum;
    }
	
	public static void main(String[] args) {
		int[] nums = {3,0,1};
		System.out.println(missingNumber2(nums));
	}
      
}
