package module2;

public class RemoveDuplicate {
	//remove duplicate elements from an array 
	public static void main(String[] args) {
		int[] arr= {1,2,2,3,4,5,5,6};
		int j=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[j]) {
				j++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=arr[j];
			}
		}
		for(int i=0;i<j;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
