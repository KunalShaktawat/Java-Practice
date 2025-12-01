package module2;

public class BinaryS {
	static int binarySearch(int arr[],int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]<target) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {12,14,16,18,35,45,67,456};
		int i=binarySearch(arr, 12);
		System.out.println(i);
	}

}
