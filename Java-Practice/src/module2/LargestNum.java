package module2;

public class LargestNum {
	public static void main(String[] args) {
		int arr[]= {12,14,18,16,20,19};
		int largestNum=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largestNum) {
				largestNum=arr[i];
			}
		}
		System.out.println(largestNum);
	}   
}
