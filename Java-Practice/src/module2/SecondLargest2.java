package module2;

public class SecondLargest2 {
	public static void main(String[] args) {
		int arr[]= {12,16,18,14,18};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
    		secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		System.out.println("Largest number is "+largest);
		System.out.println("Second largest number is "+secondLargest);
	
		
	}

}
