package dsajava;

public class MaxSumSubarray {
	public static void main(String[] args) {
		int[] arr= {3,5,4,2,8,6,9};
		int k=3;
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		int maxSum=sum;
		for(int j=0;j<arr.length-k;j++) {
			sum+=arr[j+k]-arr[j];
			maxSum=Math.max(maxSum,sum);
		}
		System.out.println(maxSum);
	}
}








