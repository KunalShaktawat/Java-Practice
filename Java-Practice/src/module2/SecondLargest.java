package module2;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr= {22,44,55,88,11,88};
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("Largest number is "+largest);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<largest && arr[i]>second) {
				second=arr[i];
			}
		}
		System.out.println("Second largest number is "+second);
	}
}
