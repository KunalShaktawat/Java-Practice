package assignment1;

import java.util.Scanner;

public class PlayNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int sum=0,digit=0;
		int rev=0;
		while(num>0) {
			int d=num%10;
			rev=rev*10+d;
			sum=sum+d;
			digit++;
			num=num/10;
	
		}
		System.out.println("Sum is: "+sum);
		System.out.println("Reverse is: "+rev);
		System.out.println("Total number of digits are: "+digit);
	}

}
