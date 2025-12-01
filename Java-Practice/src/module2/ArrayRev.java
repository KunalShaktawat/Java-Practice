package module2;

import java.util.Scanner;

public class ArrayRev {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
	//	int revArr[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
