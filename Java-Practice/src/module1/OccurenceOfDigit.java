package module1;

import java.util.Scanner;

public class OccurenceOfDigit {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the digit");
		int digit=sc.nextInt();
		int count=0;
		while(num>0) {
			int d=num%10;
			if(d==digit) {
				count++;
			}
			num=num/10;
		}	
		System.out.println(count);
	}

}
