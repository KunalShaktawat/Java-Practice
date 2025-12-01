package module2;

import java.util.Scanner;

public class SquareOfMatrix {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		System.out.println("Enter the elements of matrix");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr[i][j]);	
			}
			System.out.println();
		} 
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr[i][j]*arr[i][j]+" 1");
			}
			System.out.println();
		}
    }
}
