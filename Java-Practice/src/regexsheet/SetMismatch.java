package regexsheet;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
	// My Solution
	public static int[] findErrorNums(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        int arr[]=new int[2];
        for(int n:nums){
            if(set.contains(n)){
                arr[0]=n;
                break;
            }
            set.add(n);
        }
        int n=nums.length;
        int sum=n*(n+1)/2;
        int actualSum=0;
        for(int num:nums){
            actualSum+=num;
        }
        arr[1]=sum-(actualSum-arr[0]);
        return arr;
    } 
	public static void main(String[] args) {
		int nums[]= {1,2,3,3,4};
		int arr[]=findErrorNums(nums);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
