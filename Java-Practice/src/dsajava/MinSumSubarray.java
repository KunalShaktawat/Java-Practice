package dsajava;

import java.util.Scanner;

public class MinSumSubarray {
	public static void main(String[] args) {
		int[] arr= {3,3,4,2,6,3,1,0};
		int k=3;
		int minSum=0;
		for(int i=0;i<k;i++) {
			minSum+=arr[i];
		}
		int curr_sum=minSum;
		for(int j=k;j<arr.length;j++) {
			curr_sum+=arr[j]-arr[j-k];
			minSum=Math.min(minSum, curr_sum);
		}
		System.out.println("Minimum Sum: "+minSum);
		
	}

}
