package module1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto series");
		int num=sc.nextInt();
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		for(int i=2;i<num;i++) {
			int sum=first+second;
			System.out.println(sum);
			first=second;
			second=sum; 
		}
	}
}
